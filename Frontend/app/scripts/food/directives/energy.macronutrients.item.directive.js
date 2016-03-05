define(['angularAMD'], function (angularAMD) {

    'use strict';

    angularAMD.directive('energyMacronutrientsItem', ['$rootScope', function (  $rootScope) {

            return {

                restrict: 'EA',
                scope:{ energy: "=", key:'@' },
                templateUrl: 'views/food/energy.macronutrients.item.tpl.html',
                controller: ['$scope', function( $scope ) {


                }],
                link: function (scope, element, attrs) {


                }
            };
        }]);
});