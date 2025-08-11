//onjects

const obj ={
    name:"Likith",
    age:15,
    fun1:()=>{return"Hello"}
}
console.log(obj.name);
console.log(obj.age);
console.log(obj.fun1());


//classes objects construtors 


class solution
{
    constructor(a)
    {
        console.log(`constructor invocked with parameter ${a}`);
    }
    function2()
    {
        console.log("in function 2")
    }
}
let obj1=new solution(10);
obj1.function2()

// Inheritance and Super keyword and super can be added with parameters in order to invoke the parameterized   parent constructers
//also using super.method() we can acess the parent methods
class person
{
    constructor (message)
    {
        console.log("Inside the constructer"+" " +message)
    }
    sleep()
    {
        console.log("I can sleep");

    }
    eat()
    {
        console.log("I love to Eat")
    }
}

class student extends person
{
    constructor(message)
    {
        super(message);
        console.log("Inside the constructer2")
        super.eat();
    }
    work()
    {
        console.log("I can Work");
    }
    study()
    {
        console.log("I can Eat");
    }
}

let o=new student("hi parent")
o.work();
o.study();

