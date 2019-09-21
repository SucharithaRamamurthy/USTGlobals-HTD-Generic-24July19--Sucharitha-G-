var MathOperations;
(function (MathOperations) {
    var Circle;
    (function (Circle) {
        var PI = 3.14;
        function circumferenceOfCircle(radius) {
            console.log("the circumference of circle" + 2 * PI * radius);
        }
        Circle.circumferenceOfCircle = circumferenceOfCircle;
        function areaOfCircle(radius) {
            console.log("areaOfCircle =" + 2 * PI * radius * radius);
        }
        Circle.areaOfCircle = areaOfCircle;
    })(Circle = MathOperations.Circle || (MathOperations.Circle = {}));
})(MathOperations || (MathOperations = {}));
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
///<reference path="./circle.ts"/>
///<reference path="./rectangle.ts"/>
MathOperations.Circle.circumferenceOfCircle(243);
MathOperations.Rectangle.areaOfRectangle(5, 6);
