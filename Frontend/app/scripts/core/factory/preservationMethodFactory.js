/**
 * Preservation Method Factory Model
 * @author Jose Carlos
 * @email jozecarlos.it@gmail.com
 *
 */
define(['angularAMD'], function (angularAMD) {

    'use strict';

    angularAMD.factory('PreservationMethod', ['$http', '$rootScope', '$log', function ($http, $rootScope, $log) {

        /**
         *
         * @param data
         * @constructor
         */
        function PreservationMethod(data) {

            if (data) {
                this.setData(data);
            }
        }

        /**
         *
         * @type {{setData: Function, load: Function, update: Function, getHost: Function}}
         */
        PreservationMethod.prototype = {

            setData: function (data) {
                angular.extend(this, data);
            },

            list: function(){

                var self = this;

                $http.get( $rootScope.getHost() + "preservation-methods" )

                    .success(function ( data, status, headers, config ) {
                        if (data.message == 'no matches found') {
                            $rootScope.$broadcast("PRESERVATION_METHOD_LIST_LOAD_ERROR");
                        } else {
                            self.setData(data);
                            $rootScope.$broadcast("PRESERVATION_METHOD_LIST_LOADED");
                        }
                    })
                    .error(function (message) {
                        $log.error(message);
                        $rootScope.$broadcast("PRESERVATION_METHOD_LIST_LOAD_ERROR");
                    });
            }
        };

        return PreservationMethod;

    }]);
});
