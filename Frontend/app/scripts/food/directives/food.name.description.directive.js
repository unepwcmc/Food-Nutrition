define(['angularAMD'], function (angularAMD) {

    'use strict';

    angularAMD.directive('foodNameDescription', ['$timeout', '$rootScope', 'toastr',
        function ( $timeout, $rootScope, toastr ) {

            return {

                restrict: 'EA',
                templateUrl: 'views/food/food.name.description.tab.tpl.html',

                controller: ['$scope', '$http', '$rootScope', '$state', '$q',
                    function( $scope, $http, $rootScope, $state, $q ) {


                }],
                link: function (scope, element, attrs) {


                }
            };
        }]);
});