define(['app',
    'food/directives/general.information.directive',
    'food/directives/food.name.description.directive',
    'food/directives/sampling.directive',
    'food/directives/reference.directive',
    'food/directives/general.analysis.directive',
    'food/directives/energy.macronutrients.directive',
    'food/directives/micronutrients.directive',
    'food/directives/other.components.directive',
    'core/factory/foodFactory',
    'core/factory/FoodGroupFactory',
    'core/factory/FoodTypeFactory'], function () {

    'use strict';

    return ['$scope','$rootScope','BaseController','Food','FoodGroup','FoodType','$stateParams', function ($scope, $rootScope, BaseController, Food, FoodGroup,FoodType, $stateParams) {

            angular.extend($scope, BaseController);


             $scope.foodGroup = new FoodGroup();
             $scope.foodType = new FoodType();
             $scope.food = new Food();

            $scope.$on('$stateChangeSuccess', function(event, toState, toParams, fromState, fromParams){
                console.log('state Change Success');
            });

            /**
             * Listener when the view is loaded
             */
            $scope.$on('$viewContentLoaded', function() {
                console.log('view Content Loaded...');

                $scope.foodGroup.list();
                $scope.foodType.list();
                $scope.food.get( $stateParams.id );
            });

            $scope.$on('FOOD_LOADED', function() {
                console.log('food loaded');
                console.log($scope.food);

                $('#loader-wrapper').fadeToggle('400');
            });

            $scope.$on('ACTION_SAVE', function(){
                $('#loader-wrapper').fadeToggle('400');

                 $scope.food.update();
            });

            $scope.$on('FOOD_UPDATED', function() {
                $('#loader-wrapper').fadeToggle('400');
            });

        }];
});