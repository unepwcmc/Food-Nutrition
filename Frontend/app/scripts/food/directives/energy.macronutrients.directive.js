define(['angularAMD',
        'core/factory/nutrientFactory',
        'food/directives/energy.macronutrients.item.directive'], function (angularAMD) {

    'use strict';

    angularAMD.directive('energyMacronutrients', ['$rootScope','Nutrient', function ( $rootScope, Nutrient ) {

            return {

                restrict: 'EA',
                templateUrl: 'views/food/energy.macronutrients.tab.tpl.html',

                controller: ['$scope','$rootScope',function( $scope, $rootScope ) {

                         $scope.carbohydrates_polyols= [];
                         $scope.carbohydrates_fibre = [];
                         $scope.carbohydrates_poly = [];
                         $scope.carbohydrates_polyols= [];
                         $scope.carbohydrates = [];

                         var nutrient = new Nutrient();

                        nutrient.filterByType('FIBRE', function( data, status){
                            $scope.carbohydrates_fibre = data;
                        });

                        nutrient.filterByType('SUGARS', function( data, status){
                            $scope.carbohydrates_sugars = data;
                        });


                        nutrient.filterByType('POLYSACCHARIDES', function( data, status){
                            $scope.carbohydrates_poly = data;
                        });

                        nutrient.filterByType('POLYOLS', function( data, status){
                            $scope.carbohydrates_polyols= data;
                        });

                        nutrient.filterByType('CARBOHYDRATES_TOTAL', function( data, status){
                            $scope.carbohydrates = data;
                        });

                    }],
                link: function (scope, element, attrs) {
                }
            };
        }]);
});