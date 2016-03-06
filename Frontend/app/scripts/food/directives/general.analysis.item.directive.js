define(['angularAMD'], function (angularAMD) {

    'use strict';

    angularAMD.directive('generalAnalysisItem', ['$rootScope', function ( $rootScope ) {

            return {

                restrict: 'EA',
                templateUrl: 'views/food/general.analysis.item.tpl.html',
                scope:{ analysis: "=", key:'@' },
                controller: ['$scope','$timeout', function( $scope, $timeout ) {
                }],
                link: function (scope, element, attrs) {
                }
            };
        }]);
});