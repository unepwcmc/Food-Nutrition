define(['angularAMD'], function (angularAMD) {

    'use strict';

    angularAMD.directive('nutrientItem', ['$rootScope', function ( $rootScope ) {

            return {

                restrict: 'EA',
                templateUrl: 'views/food/nutrient.item.tpl.html',
                scope:{ nutrient: "=", key:'=' },
                controller: ['$scope','$timeout', function( $scope, $timeout ) {
                }],
                link: function (scope, element, attrs) {
                }
            };
        }]);
});