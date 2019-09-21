var MathOperations;
(function (MathOperations) {
    var Rectangle;
    (function (Rectangle) {
        var PI = 3.14;
        function areaOfRectangle(length, bredth) {
            console.log("area of rectangle " + PI * (length * bredth));
        }
        Rectangle.areaOfRectangle = areaOfRectangle;
    })(Rectangle = MathOperations.Rectangle || (MathOperations.Rectangle = {}));
})(MathOperations || (MathOperations = {}));
