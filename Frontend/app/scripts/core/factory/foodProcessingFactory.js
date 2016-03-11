/**
 * Food Processing Factory Model
 * @author Jose Carlos
 * @email jozecarlos.it@gmail.com
 *
 */
define(['angularAMD'], function (angularAMD) {

    'use strict';

    angularAMD.factory('FoodProcessing', ['$http', '$rootScope', '$log', function ($http, $rootScope, $log) {

        /**
         *
         * @param data
         * @constructor
         */
        function FoodProcessing(data) {

            if (data) {
                this.setData(data);
            }
        }

        /**
         *
         * @type {{setData: Function, load: Function, update: Function, getHost: Function}}
         */
        FoodProcessing.prototype = {

            setData: function (data) {
                angular.extend(this, data);
            },

            list: function(){

                var self = this;

                $http.get( $rootScope.getHost() + "foods-processing" )

                    .success(function ( data, status, headers, config ) {
                        if (data.message == 'no matches found') {
                            $rootScope.$broadcast("FOOD_PROCESSING_LIST_LOAD_ERROR");
                        } else {
                            self.setData(data);
                            $rootScope.$broadcast("FOOD_PROCESSING_LIST_LOADED");
                        }
                    })
                    .error(function (message) {
                        $log.error(message);
                        $rootScope.$broadcast("FOOD_PROCESSING_LIST_LOAD_ERROR");
                    });
            }
        };

        return FoodProcessing;

    }]);
});
