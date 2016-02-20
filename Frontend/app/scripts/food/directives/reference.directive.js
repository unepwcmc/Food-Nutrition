define(['angularAMD'], function (angularAMD) {

    'use strict';

    angularAMD.directive('reference', ['$timeout', '$rootScope', 'toastr',
        function ( $timeout, $rootScope, toastr ) {

            return {

                restrict: 'EA',
                templateUrl: 'views/food/reference.tab.tpl.html',

                controller: ['$scope', '$http', '$rootScope', '$state', '$q',
                    function( $scope, $http, $rootScope, $state, $q ) {


                    }],
                link: function (scope, element, attrs) {


                }
            };
        }]);
});