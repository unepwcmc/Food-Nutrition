define(['include', 'language'], function (angularAMD, language) {

    'use strict';

    var app = angular.module('Food-Nutrition',  [
            'ui.router',
            'ngResource',
            'ngSanitize',
            'ngCookies',
            'toastr',
            'pascalprecht.translate',
            'leaflet-directive',
            'angucomplete-alt',
            'tableSort'
        ]
    );

    app.config(['$stateProvider', '$provide', '$urlRouterProvider', '$httpProvider',

        function ($stateProvider, $provide, $urlRouterProvider, $httpProvider, toastr) {

            $urlRouterProvider.otherwise('/home');

            $stateProvider

                .state('home', angularAMD.route(
                    {
                        url: '/home',
                        templateUrl: 'views/home/default.html',
                        controllerUrl: 'home/controllers/homeController'

                    }));

            $provide.factory('authInterceptor', ['$rootScope', '$q', '$window', '$cookies',
                function ($rootScope, $q, $window, $cookies) {
                    return {
                        request: function (config) {
                            config.headers = config.headers || {};
                            if ($cookies.get('tokenSecret') && $cookies.get('tokenSecret') != "null") {
                                config.headers['X-AUTH-TOKEN'] = $cookies.get('tokenSecret');
                                $rootScope.username = $cookies.get('user');
                                $rootScope.userId = $cookies.get('userId');
                                $rootScope.userRole = $cookies.get('userRole');
                                $rootScope.fullName = $cookies.get('fullName');
                                $rootScope.logged = true;
                            } else {
                                config.headers['X-AUTH-TOKEN'] = app.token;
                                $rootScope.username = null;
                                $rootScope.fullName = null;
                                $rootScope.userId = null;
                                $rootScope.userRole = null;
                                $rootScope.logged = false;
                            }
                            return config;
                        },
                        response: function (response) {
                            if (response.status === 401) {
                                // handle the case where the user is not authenticated
                            }
                            if (response.status === 400) {
                                console.log('400');
                            }
                            return response || $q.when(response);
                        }
                    };
                }]);

            $provide.factory('errorHandlerInterceptor', ['$rootScope', '$q', '$window', '$location', 'toastr',
                function ($rootScope, $q, $window, $location, toastr) {
                    return {
                        request: function(config) {
                            return config;
                        },
                        requestError : function(rejection) {
                            return rejection;
                        },
                        responseError : function(rejection) {
                            if( rejection.status === 401 ) {
                                if (rejection.config.url.indexOf("/login") < 0) {
                                    $rootScope.$broadcast("ErrorInterceptor", 401, rejection.statusText);
                                }
                                return $q.reject(rejection);
                            }
                            if( rejection.status === 400 ) {
                                if (rejection.config.url.indexOf("/forgetpassword") < 0) {
                                    $rootScope.$broadcast("ErrorInterceptor", 400);
                                }
                                return $q.reject(rejection);
                            }
                            if( rejection.status === 404 ) {
                                $rootScope.$broadcast("ErrorInterceptor", 404);
                                return $q.reject(rejection);
                            }
                            if( rejection.status >= 500) {
                                $rootScope.$broadcast("ErrorInterceptor", 500);
                                return $q.reject(rejection);
                            }
                            return $q.reject(rejection);

                        }
                    };
                }]);

            $httpProvider.interceptors.push('authInterceptor');
            $httpProvider.interceptors.push('errorHandlerInterceptor');

        }]);

    app.config(['toastrConfig', '$translateProvider',
        function (toastrConfig, $translateProvider) {

            angular.extend(toastrConfig, {
                allowHtml: false,
                closeButton: true,
                closeHtml: '<span class="close_button"></span>'
            });

            $translateProvider.translations('pt_BR', language.pt_BR);
            $translateProvider.translations('en_GB', language.en_GB);

            $translateProvider.useSanitizeValueStrategy('sanitizeParameters');
            //$translateProvider.preferredLanguage('pt_BR');
            $translateProvider.preferredLanguage('en_GB');
        }]);

    app.CONST = {
        LOCALHOST: "http://localhost:8080/", //LOCAL
        //LOCALHOST:"http://ec2-54-94-203-12.sa-east-1.compute.amazonaws.com:8080/", // DEV
        //LOCALHOST:"http://ec2-54-94-149-79.sa-east-1.compute.amazonaws.com:8080/", // QA
        //SERVER:"http://ec2-54-94-149-79.sa-east-1.compute.amazonaws.com:8080/", // QA
        SERVER: "http://ec2-54-94-203-12.sa-east-1.compute.amazonaws.com:8080/"  // DEV
    };

    app.run(['$rootScope', '$timeout', '$http', '$window', '$cookies',
        function ($rootScope, $timeout, $http, $window, $cookies) {

            /**
             * Return the current host
             *
             * @returns {*}
             */
            $rootScope.getHost = function () {

                if (document.location.hostname === 'localhost') {

                    return app.CONST.LOCALHOST;
                }
                else {
                    return app.CONST.SERVER;
                }
            };

            /**
             * Process the user login
             */
            $rootScope.login = function(user, callback) {

                $http.post( $rootScope.getHost() + "login", user )
                    .success(function (data, status, headers, config) {

                        $cookies.put('user', data.user.username);
                        $cookies.put('userId', data.user.id);
                        $cookies.put('userRole', data.user.userRole.role);
                        $cookies.put('tokenSecret', data.token);
                        $cookies.put('fullName', data.user.firstName + ' ' + data.user.lastName);

                        $http.defaults.headers.common['X-AUTH-TOKEN'] = data.token;

                        $rootScope.userRole = data.user.userRole.role;
                        $rootScope.userId = data.user.id;
                        $rootScope.username = data.user.username;
                        $rootScope.fullName = data.user.firstName + ' ' + data.user.lastName;
                        $rootScope.logged = true;

                        if (callback) {
                            callback(data, status, headers, config);
                        }

                        $rootScope.$broadcast("AuthenticationDone", data.user);
                    })
                    .error(function(data, status, headers, config){
                            if (callback) {
                                callback(data, status, headers, config);
                            }
                        }
                    );

            };

            /**
             * Process the user logout
             */
            $rootScope.logout = function(callback) {

                $http.post( $rootScope.getHost() + "logout", {} )

                    .success(function (data, status, headers, config) {

                        $rootScope.cleanCredentials();

                        if (callback) {
                            callback(data, status, headers, config);
                        }

                        $rootScope.$broadcast("LogoutDone");
                    })
                    .error(function(data, status, headers, config){
                        $rootScope.cleanCredentials();

                        if (callback) {
                            callback(data, status, headers, config);
                        }
                        $rootScope.$broadcast("LogoutDone");
                    });
            };

            /**
             * Clean the user logged credentials
             */
            $rootScope.cleanCredentials = function() {

                $cookies.remove('user');
                $cookies.remove('userId');
                $cookies.remove('userRole');
                $cookies.remove('tokenSecret');
                $cookies.remove('fullName');

                $http.defaults.headers.common['X-AUTH-TOKEN'] = undefined;

                $rootScope.userRole = null;
                $rootScope.userId = null;
                $rootScope.username = null;
                $rootScope.fullName = null;
                $rootScope.logged = false;
            };

        }]);

    return angularAMD.bootstrap(app);
});
