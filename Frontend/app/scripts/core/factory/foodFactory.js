/**
 * Food Factory Model
 * @author Jose Carlos
 * @email jozecarlos.it@gmail.com
 *
 */
define(['angularAMD'], function (angularAMD) {

    'use strict';

    angularAMD.factory('Food', ['$http', '$rootScope', '$log', function ($http, $rootScope, $log) {

        /**
         *
         * @param data
         * @constructor
         */
        function Food(data) {

            if (data) {
                this.setData(data);
            }
        }

        /**
         *
         * @type {{setData: Function, load: Function, update: Function, getHost: Function}}
         */
        Food.prototype = {

            setData: function (data) {
                angular.extend(this, data);
            },

            get: function( id){

                var self = this;

                $http.get( $rootScope.getHost() + "foods/" + id )

                    .success(function ( data, status, headers, config ) {
                        if (data.message == 'no matches found') {
                            $rootScope.$broadcast("FOOD_LOAD_ERROR");
                        } else {
                            self.setData(data);
                            $rootScope.$broadcast("FOOD_LOADED");
                        }
                    })
                    .error(function (message) {
                        $log.error(message);
                        $rootScope.$broadcast("FOOD_LOAD_ERROR");
                    });
            },
            update: function ( callback ) {

                $http.put( $rootScope.getHost() + "foods/" + this.id, this)
                    .success(function ( data, status, headers, config ) {

                        if(callback)
                            callback( data, status, headers, config);

                        $rootScope.$broadcast("FOOD_UPDATED");
                    })
                    .error(function ( data, status, headers, config ) {

                        if(callback)
                            callback( data, status, headers, config);

                        $log.error(data.message);
                    });
            }
        };

        return Food;

    }]);
});
