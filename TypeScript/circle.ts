namespace  MathOperations{
    export namespace Circle{
    const PI = 3.14;

   export function circumferenceOfCircle(radius: number){
        console.log("the circumference of circle"+ 2*PI*radius);
    }
    export function areaOfCircle(radius : number){
        console.log("areaOfCircle =" +2*PI*radius*radius);
    }
}
}
