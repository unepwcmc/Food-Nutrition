define(['angularAMD',
    'core/factory/nutrientFactory',
    'food/directives/nutrient.item.directive'], function (angularAMD) {

    'use strict';

    angularAMD.directive('otherComponents', ['$timeout', '$rootScope', 'toastr', 'Nutrient',
        function ( $timeout, $rootScope, toastr, Nutrient ) {

            return {

                restrict: 'EA',
                templateUrl: 'views/food/other.components.tab.tpl.html',

                controller: ['$scope', '$http', '$rootScope', '$state', '$q',
                    function( $scope, $http, $rootScope, $state, $q ) {

                        var nutrient = new Nutrient();

                        // Bioactive compounds
                        $scope.flavonoids = [];
                        $scope.tannins = [];
                        $scope.phenolic_acids = [];
                        $scope.bioactive_others = [];

                        nutrient.filterByType('FLAVONOIDS', function( data, status){
                            $scope.flavonoids = data;
                        });

                        nutrient.filterByType('TANNINS', function( data, status){
                            $scope.tannins = data;
                        });

                        nutrient.filterByType('PHENOLIC_ACIDS', function( data, status){
                            $scope.phenolic_acids = data;
                        });

                        nutrient.filterByType('OTHER', function( data, status){
                            $scope.bioactive_others = data;
                        });

                        // Organic acids
                        $scope.organic_acids = [];

                        nutrient.filterByType('ORGANIC_ACIDS', function( data, status){
                            $scope.organic_acids = data;
                        });

                        // Sterols
                        $scope.cholesterol = [];
                        $scope.plant_sterols = [];

                        nutrient.filterByType('CHOLESTEROL', function( data, status){
                            $scope.cholesterol = data;
                        });

                        nutrient.filterByType('PLANT_STEROLS', function( data, status){
                            $scope.plant_sterols = data;
                        });

                    }],
                link: function (scope, element, attrs) {


                }
            };
        }]);
});