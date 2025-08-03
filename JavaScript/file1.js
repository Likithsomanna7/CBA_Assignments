let name="Likith";
var age=20;
const PI=3.14;
console.log(name);
console.log(age);
console.log(PI);

//this is a single line comment



/* this is
a multiline commnet*/

console.log(age+PI);
console.log(age-PI);
console.log(age/PI);
console.log(age*PI);
console.log(2%3);
console.log(2**3);




let a=5;
let b=10;
if(a===b) console.log("True");
else console.log("False");
if(a&&b)console.log("True");
if(a||b)console.log("Flase");
if(!a) console.log("false")



const ag=18;
if(ag>18)
{
    console.log("Eligible");
}
else if(ag<18)
{
    console.log("Not Eligible");
}
else
{
    console.log("Eligible");
}

switch(ag)
{
    case 18: console.log("Eligible");
            break;
    case 16:console.log("Not Eligible");
            break;
    case 21:console.log("Eligible");
            break;
    default:console.log("Not Eligible");
}

(ag>=18)?console.log("Eligible"):console.log("Not Eligible");