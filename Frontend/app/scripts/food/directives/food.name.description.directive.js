define(['angularAMD',

    'core/factory/partPlantAnimalFactory',
    'core/factory/foodProcessingFactory',
    'core/factory/preservationMethodFactory',
    'core/factory/cookingDegreeFactory',
    'core/factory/agriculturalConditionsFactory',
    'core/factory/ripenessMaturityFactory',

    ], function (angularAMD) {

    'use strict';

    angularAMD.directive('foodNameDescription',
        [
            '$timeout',
            '$rootScope',
            'PartPlantAnimal',
            'FoodProcessing',
            'PreservationMethod'
            ,'CookingDegree',
            'AgriculturalConditions',
            'RipenessMaturity',

            function (
                $timeout,
                $rootScope,
                PartPlantAnimal,
                FoodProcessing,
                PreservationMethod,
                CookingDegree,
                AgriculturalConditions,
                RipenessMaturity) {

            return {

                restrict: 'EA',
                templateUrl: 'views/food/food.name.description.tab.tpl.html',

                controller: ['$scope', function( $scope ) {

                    $scope.partPlantAnimal = new PartPlantAnimal();
                    $scope.partPlantAnimal.list();

                    $scope.foodProcessing = new FoodProcessing();
                    $scope.foodProcessing.list();

                    $scope.preservationMethod = new PreservationMethod();
                    $scope.preservationMethod.list();

                    $scope.cookingDegree = new CookingDegree();
                    $scope.cookingDegree.list();

                    $scope.agriculturalConditions = new AgriculturalConditions();
                    $scope.agriculturalConditions.list();

                    $scope.ripenessMaturity = new RipenessMaturity();
                    $scope.ripenessMaturity.list();

                }],
                link: function (scope, element, attrs) {


                }
            };
        }]);
});