function printConstructor(cons: Function){
    console.log(cons);
}

@printConstructor
class Sample{
    constructor(){
        console.log("hai hello i am  sample constructor");
    }
}
