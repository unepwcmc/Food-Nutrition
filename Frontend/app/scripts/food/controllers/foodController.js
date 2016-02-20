define(['app',
    'food/directives/general.information.directive',
    'food/directives/food.name.description.directive',
    'food/directives/sampling.directive',
    'food/directives/reference.directive',
    'food/directives/general.analysis.directive',
    'food/directives/energy.macronutrients.directive',
    'food/directives/micronutrients.directive',
    'food/directives/other.components.directive'], function () {

    'use strict';

    return ['$scope','$rootScope','BaseController', '$state','$window','$timeout',
        function ($scope, $rootScope, BaseController, $state, $window, $timeout) {

            angular.extend($scope, BaseController);

            $scope.$on('$stateChangeSuccess', function(event, toState, toParams, fromState, fromParams){
                console.log('state Change Success');
            });

            /**
             * Listener when the view is loaded
             */
            $scope.$on('$viewContentLoaded', function() {
                console.log('view Content Loaded...');
            });

        }];
});