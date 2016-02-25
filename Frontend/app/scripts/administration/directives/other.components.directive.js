define(['angularAMD'], function (angularAMD) {

    'use strict';

    angularAMD.directive('otherComponents', ['$timeout', '$rootScope', 'toastr',
        function ( $timeout, $rootScope, toastr ) {

            return {

                restrict: 'EA',
                templateUrl: 'views/administration/other.components.tab.tpl.html',

                controller: ['$scope', '$http', '$rootScope', '$state', '$q',
                    function( $scope, $http, $rootScope, $state, $q ) {


                    }],
                link: function (scope, element, attrs) {


                }
            };
        }]);
});