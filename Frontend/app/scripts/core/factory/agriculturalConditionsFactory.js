/**
 * Agricultural Conditions Factory Model
 * @author Jose Carlos
 * @email jozecarlos.it@gmail.com
 *
 */
define(['angularAMD'], function (angularAMD) {

    'use strict';

    angularAMD.factory('AgriculturalConditions', ['$http', '$rootScope', '$log', function ($http, $rootScope, $log) {

        /**
         *
         * @param data
         * @constructor
         */
        function AgriculturalConditions(data) {

            if (data) {
                this.setData(data);
            }
        }

        /**
         *
         * @type {{setData: Function, load: Function, update: Function, getHost: Function}}
         */
        AgriculturalConditions.prototype = {

            setData: function (data) {
                angular.extend(this, data);
            },

            list: function(){

                var self = this;

                $http.get( $rootScope.getHost() + "agricultural-conditions" )

                    .success(function ( data, status, headers, config ) {
                        if (data.message == 'no matches found') {
                            $rootScope.$broadcast("AGRICULTURAL_CONDITIONS_LIST_LOAD_ERROR");
                        } else {
                            self.setData(data);
                            $rootScope.$broadcast("AGRICULTURAL_CONDITIONS_LIST_LOADED");
                        }
                    })
                    .error(function (message) {
                        $log.error(message);
                        $rootScope.$broadcast("AGRICULTURAL_CONDITIONS_LIST_LOAD_ERROR");
                    });
            }
        };

        return AgriculturalConditions;

    }]);
});
