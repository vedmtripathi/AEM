/**
 * Created by Shashi Bhushan on 1/2/2017.
 */

"use strict";

;(function($){
    window.clientLib = window.clientLib || {
            printHello: function() {
                console.log("Hello World");
            },
            print: function(msg) {
                console.log(msg);
            }
        };
})(jQuery);
