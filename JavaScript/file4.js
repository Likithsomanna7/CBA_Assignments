function myfun(args)
{
    console.log(args);
    return args;
}
console.log(myfun(10))

//fat arrow function

const function1=(a,b) =>
{
    return a+b;
}

console.log(function1(10,10));


//for each loop  or Higher Order Functions
let arr=[10,20,30,40,50]
arr.forEach((x,indx)=>{console.log(x);console.log(indx)})


//map which returns a array


let arr1=arr.map(
    (c)=>
        {
            return c*c
        }
    );
console.log(arr1)



// filter function

let arr4=[10,20,30,43,21,3]
let arr5=arr4.filter((x)=>{return x%2==0})

console.log(arr5);


//reduce 
let arr6=[1,2,3,4];
const result=arr6.reduce((acc,curr)=>curr+acc);
console.log(result);