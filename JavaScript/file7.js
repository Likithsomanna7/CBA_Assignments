
//Asynchronous Programing

console.log("1");
console.log("2");
setTimeout(()=>{console.log(`2+2=${2+2}`)},4000);
console.log("3");
console.log("4");

//callbacks

const sum=(a,b)=>{
    console.log(`${a}+${b}=${a+b}`);
}
function calculate(a,b,sumcallback)
{
    sumcallback(a,b);
}
calculate(10,20,sum);

//callback hell Nested callbacks

function fun(i,cllbck)
{
    setTimeout(()=>
        {
        console.log(`hello ${i}`);
        if(cllbck)
            {
                cllbck()
            }
        }
            ,2000);
    
}

fun(1,()=>{fun(2,()=>{fun(3)})})



//promises



let kid=new Promise((resolve,reject)=>{console.log("gotch You");resolve("Sucesss")})
kid.then(()=>{console.log("Hey Got It")}).catch(()=>console.log("Didnt Get"));

let kids=new Promise((resolve,reject)=>{console.log("gotch You");reject("Failure")})
kids.then(()=>{console.log("Hey Got It")}).catch((err)=>console.log(err));

const api =(data)=>
    {
        return new Promise((resolve,reject)=>
    {
        setTimeout(()=>{
            console.log(`Todays temperature is ${97+data} Fahrenheit`);
            resolve("Sucess");
        },2000);
        
        
    }
);
}

(async function data() 
{
    await api(1);
    await api(2);
    await api(3);
}
)(); //IIFE self executing functions Immediately Invoked function Expression
