/**
 * Taxon Rank Factory Model
 * @author Jose Carlos
 * @email jozecarlos.it@gmail.com
 *
 */
define(['angularAMD'], function (angularAMD) {

    'use strict';

    angularAMD.factory('TaxonRank', ['$http', '$rootScope', '$log', function ($http, $rootScope, $log) {

        /**
         *
         * @param data
         * @constructor
         */
        function TaxonRank(data) {

            if (data) {
                this.setData(data);
            }
        }

        /**
         *
         * @type {{setData: Function, load: Function, update: Function, getHost: Function}}
         */
        TaxonRank.prototype = {

            setData: function (data) {
                angular.extend(this, data);
            },

            list: function(){

                var self = this;

                $http.get( $rootScope.getHost() + "taxon-ranks" )

                    .success(function ( data, status, headers, config ) {
                        if (data.message == 'no matches found') {
                            $rootScope.$broadcast("TAXON_RANKS_LIST_LOAD_ERROR");
                        } else {
                            self.setData(data);
                            $rootScope.$broadcast("TAXON_RANKS_LIST_LOADED");
                        }
                    })
                    .error(function (message) {
                        $log.error(message);
                        $rootScope.$broadcast("TAXON_RANKS_LIST_LOAD_ERROR");
                    });
            }
        };

        return TaxonRank;

    }]);
});
