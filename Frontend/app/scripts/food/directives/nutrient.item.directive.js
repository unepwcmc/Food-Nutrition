define(['angularAMD'], function (angularAMD) {

    'use strict';

    angularAMD.directive('nutrientItem', ['$rootScope', function ( $rootScope ) {

            return {

                restrict: 'EA',
                templateUrl: 'views/food/nutrient.item.tpl.html',
                scope:{ nutrient: "=", key:'=' },
                controller: ['$scope','$timeout', function( $scope, $timeout ) {

                    $rootScope.$watch('editMode', function( newValue, oldValue ){
                        $scope.editMode = newValue;
                    }, true);

                }],
                link: function (scope, element, attrs) {
                }
            };
        }]);
});