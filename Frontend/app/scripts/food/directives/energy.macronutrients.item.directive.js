define(['angularAMD'], function (angularAMD) {

    'use strict';

    angularAMD.directive('energyMacronutrientsItem', ['$rootScope', function ( $rootScope ) {

            return {

                restrict: 'EA',
                templateUrl: 'views/food/energy.macronutrients.item.tpl.html',
                scope:{ nutrient: "=", key:'@' },
                controller: ['$scope','$timeout', function( $scope, $timeout ) {

                        console.log($scope.analysis);
                }],
                link: function (scope, element, attrs) {
                }
            };
        }]);
});