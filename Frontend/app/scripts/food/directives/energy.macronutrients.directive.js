define(['angularAMD',
        'core/factory/nutrientFactory',
        'food/directives/nutrient.item.directive'], function (angularAMD) {

    'use strict';

    angularAMD.directive('energyMacronutrients', ['$rootScope','Nutrient', function ( $rootScope, Nutrient ) {

            return {

                restrict: 'EA',
                templateUrl: 'views/food/energy.macronutrients.tab.tpl.html',

                controller: ['$scope','$rootScope',function( $scope, $rootScope ) {

                        var nutrient = new Nutrient();

                        // Protein
                        $scope.protein = [];
                        $scope.amino_acids = [];
                        $scope.nitrogen = [];

                        nutrient.filterByType('PROTEIN', function( data, status){
                            $scope.protein = data;
                        });

                        nutrient.filterByType('AMINO_ACIDS', function( data, status){
                            $scope.amino_acids = data;
                        });

                        nutrient.filterByType('NITROGEN', function( data, status){
                            $scope.nitrogen = data;
                        });

                        // Lipids
                        $scope.fatty_acids = [];
                        $scope.saturated = [];
                        $scope.monosaturated = [];
                        $scope.polyunsaturated = [];
                        $scope.fat_components = [];

                        nutrient.filterByType('FATTY_ACIDS_TOTAL', function( data, status){
                            $scope.fatty_acids = data;
                        });

                        nutrient.filterByType('FATTY_ACIDS_SATURATED', function( data, status){
                            $scope.saturated = data;
                        });

                        nutrient.filterByType('FATTY_ACIDS_MONOUNSATURATED', function( data, status){
                            $scope.monosaturated = data;
                        });

                        nutrient.filterByType('FATTY_ACIDS_POLYUNSATURATED', function( data, status){
                            $scope.polyunsaturated = data;
                        });

                        nutrient.filterByType('FAT_COMPONENTS', function( data, status){
                            $scope.fat_components = data;
                        });


                        // Carbohydrates
                        $scope.carbohydrates_polyols= [];
                        $scope.carbohydrates_fibre = [];
                        $scope.carbohydrates_poly = [];
                        $scope.carbohydrates_polyols= [];
                        $scope.carbohydrates = [];

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