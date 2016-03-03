define(['app',
    'food/directives/general.information.directive',
    'food/directives/food.name.description.directive',
    'food/directives/sampling.directive',
    'food/directives/reference.directive',
    'food/directives/general.analysis.directive',
    'food/directives/energy.macronutrients.directive',
    'food/directives/micronutrients.directive',
    'food/directives/other.components.directive',
    'core/factory/foodFactory'], function () {

    'use strict';

    return ['$scope','$rootScope','BaseController','Food','$stateParams', function ($scope, $rootScope, BaseController, Food, $stateParams) {

            angular.extend($scope, BaseController);

             $scope.food = new Food();

            $scope.$on('$stateChangeSuccess', function(event, toState, toParams, fromState, fromParams){
                console.log('state Change Success');
            });

            /**
             * Listener when the view is loaded
             */
            $scope.$on('$viewContentLoaded', function() {
                console.log('view Content Loaded...');

                $scope.food.get( $stateParams.id );
            });

            $scope.$on('FOOD_LOADED', function() {
                    $('#loader-wrapper').fadeToggle('400');

                console.log($scope.food);
            });

        }];
});