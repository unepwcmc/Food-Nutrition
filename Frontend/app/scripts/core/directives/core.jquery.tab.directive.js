define(['angularAMD', 'bootstrap'], function (angularAMD) {

    'use strict';

    angularAMD.directive('uiTab', function ( ) {

        return {
            restrict: 'A',
            link: function (scope, element, attrs) {

                $(element).find('a').click(function (e) {
                    e.preventDefault();
                    $(this).tab('show');

                    //console.log("Here: ", element);

                    var textAreas = $('.tab-content').find('textarea');
                    textAreas.trigger('click');
                });
            }
        };
    });
});