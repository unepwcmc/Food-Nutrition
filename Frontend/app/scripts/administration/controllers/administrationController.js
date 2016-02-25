define(['app',
    'administration/directives/general.information.directive',
    'administration/directives/food.name.description.directive',
    'administration/directives/sampling.directive',
    'administration/directives/reference.directive',
    'administration/directives/general.analysis.directive',
    'administration/directives/energy.macronutrients.directive',
    'administration/directives/micronutrients.directive',
    'administration/directives/other.components.directive'], function () {

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