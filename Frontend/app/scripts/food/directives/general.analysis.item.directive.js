define(['angularAMD'], function (angularAMD) {

    'use strict';

    angularAMD.directive('generalAnalysisItem', ['$rootScope', function ( $rootScope ) {

            return {

                restrict: 'EA',
                templateUrl: 'views/food/general.analysis.item.tpl.html',
                scope:{ analysis: "=", key:'@', name: '@' },
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