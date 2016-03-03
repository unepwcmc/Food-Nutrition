define(['angularAMD','food/directives/general.analysis.item.directive'], function (angularAMD) {

    'use strict';

    angularAMD.directive('generalAnalysis', [ '$rootScope', function ( $rootScope ) {

            return {

                restrict: 'EA',
                templateUrl: 'views/food/general.analysis.tab.tpl.html',

                controller: ['$scope',function( $scope ) {


                }],
                link: function (scope, element, attrs) {


                }
            };
        }]);
});