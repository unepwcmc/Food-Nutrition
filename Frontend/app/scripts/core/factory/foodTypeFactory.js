/**
 * Food Type Factory Model
 * @author Jose Carlos
 * @email jozecarlos.it@gmail.com
 *
 */
define(['angularAMD'], function (angularAMD) {

    'use strict';

    angularAMD.factory('FoodType', ['$http', '$rootScope', '$log', function ($http, $rootScope, $log) {

        /**
         *
         * @param data
         * @constructor
         */
        function FoodType(data) {

            if (data) {
                this.setData(data);
            }
        }

        /**
         *
         * @type {{setData: Function, load: Function, update: Function, getHost: Function}}
         */
        FoodType.prototype = {

            setData: function (data) {
                angular.extend(this, data);
            },

            list: function(){

                var self = this;

                $http.get( $rootScope.getHost() + "food-types" )

                    .success(function ( data, status, headers, config ) {
                        if (data.message == 'no matches found') {
                            $rootScope.$broadcast("FOOD_TYPE_LIST_LOAD_ERROR");
                        } else {
                            self.setData(data);
                            $rootScope.$broadcast("FOOD_TYPE_LIST_LOADED");
                        }
                    })
                    .error(function (message) {
                        $log.error(message);
                        $rootScope.$broadcast("FOOD_TYPE_LISTLOAD_ERROR");
                    });
            }
        };

        return FoodType;

    }]);
});
