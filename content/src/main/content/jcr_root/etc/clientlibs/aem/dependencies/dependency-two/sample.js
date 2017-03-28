/**
 * Created by Shashi Bhushan on 1/2/2017.
 *
 * Transitive Dependency ClientLib Two
 */

"use strict";

;(function($){
    window.clientLib = window.clientLib || {
            printHello: function() {
                console.log("Dependencies: Transitive Dependency Two");
            }
        };
})(jQuery);
