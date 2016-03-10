/**
 * Nutrient Factory Model
 * @author Jose Carlos
 * @email jozecarlos.it@gmail.com
 *
 */
define(['angularAMD'], function (angularAMD) {

    'use strict';

    angularAMD.factory('Nutrient', ['$http', '$rootScope', '$log', function ($http, $rootScope, $log) {

        /**
         *
         * @param data
         * @constructor
         */
        function Nutrient(data) {

            if (data) {
                this.setData(data);
            }
        }

        /**
         *
         * @type {{setData: Function, load: Function, update: Function, getHost: Function}}
         */
        Nutrient.prototype = {

            setData: function (data) {
                angular.extend(this, data);
            },
            filterByType: function( type, callback ){

                var self = this;

                $http.get( $rootScope.getHost() + "nutrient-types/search/nutrients?parent=" + type )

                    .success(function ( data, status, headers, config ) {
                        if (data.message == 'no matches found') {
                            $rootScope.$broadcast("NUTRIENT_TYPE_LOAD_ERROR");
                        } else {
                            //self.setData(data);
                            if(callback)
                                callback( data, status, headers, config);
                            $rootScope.$broadcast("NUTRIENT_TYPE_LOADED");
                        }
                    })
                    .error(function (data, status, headers, config) {
                        $log.error( data.message );
                        $rootScope.$broadcast("NUTRIENT_TYPE_LOAD_ERROR");
                    });
            }
        };

        return Nutrient;

    }]);
});
