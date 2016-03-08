define(['angularAMD',
    'core/factory/nutrientFactory',
    'food/directives/nutrient.item.directive'], function (angularAMD) {

    'use strict';

    angularAMD.directive('micronutrients', ['$timeout', '$rootScope', 'toastr', 'Nutrient',
        function ( $timeout, $rootScope, toastr, Nutrient ) {

            return {

                restrict: 'EA',
                templateUrl: 'views/food/micronutrients.tab.tpl.html',

                controller: ['$scope', '$http', '$rootScope', '$state', '$q',
                    function( $scope, $http, $rootScope, $state, $q ) {

                        var nutrient = new Nutrient();

                        // Minerals and trace elements
                        $scope.minerals = [];
                        $scope.toxic_elements = [];

                        nutrient.filterByType('MINERALS', function( data, status){
                            $scope.minerals = data;
                        });

                        nutrient.filterByType('TOXIC_TRACE_ELEMENTS_CONTAMINANTS', function( data, status){
                            $scope.toxic_elements = data;
                        });

                        // Vitamins
                        $scope.vitamin_a = []; $scope.vitamin_e = [];
                        $scope.vitamin_d = []; $scope.vitamin_k = [];
                        $scope.thiamin_b1 = []; $scope.riboflavin_b2 = [];
                        $scope.niaciin = []; $scope.folate = [];
                        $scope.panthotenic_acid = []; $scope.vitamin_b6 = [];
                        $scope.vitamin_b12 = []; $scope.biotin = []; $scope.vitamin_c = [];

                        nutrient.filterByType('VITAMIN_A_CAROTENOIDS', function( data, status){
                            $scope.vitamin_a = data;
                        });

                        nutrient.filterByType('VITAMIN_E', function( data, status){
                            $scope.vitamin_e = data;
                        });

                        nutrient.filterByType('VITAMIN_D', function( data, status){
                            $scope.vitamin_d = data;
                        });

                        nutrient.filterByType('VITAMIN_K', function( data, status){
                            $scope.vitamin_k = data;
                        });

                        nutrient.filterByType('THIAMIN_B1', function( data, status){
                            $scope.thiamin_b1 = data;
                        });

                        nutrient.filterByType('RIBOFLAVIN_B2', function( data, status){
                            $scope.riboflavin_b2 = data;
                        });

                        nutrient.filterByType('NIACIIN', function( data, status){
                            $scope.niaciin = data;
                        });

                        nutrient.filterByType('FOLATE', function( data, status){
                            $scope.folate = data;
                        });

                        nutrient.filterByType('PANTHOTENIC_ACID', function( data, status){
                            $scope.panthotenic_acid = data;
                        });

                        nutrient.filterByType('VITAMIN_B6', function( data, status){
                            $scope.vitamin_b6 = data;
                        });

                        nutrient.filterByType('VITAMIN_B12', function( data, status){
                            $scope.vitamin_b12 = data;
                        });

                        nutrient.filterByType('BIOTIN', function( data, status){
                            $scope.biotin = data;
                        });

                        nutrient.filterByType('VITAMIN_C', function( data, status){
                            $scope.vitamin_c = data;
                        });

                    }],
                link: function (scope, element, attrs) {


                }
            };
        }]);
});