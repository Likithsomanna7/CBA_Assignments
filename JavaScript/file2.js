let i=0;
let j=0;
for(i=0;i<5;i++)
{
    for(j=0;j<i;j++)
    {
        console.log(i+j);
    }
}

while(i<10)
{
    console.log(i+"\n");
    i++;
}
do
{
console.log(i)
}


while(i<10);

let str="Likith"

const obj={
    name:"likith",
    age:16,
    Gender:"Male"
};

for(let x in obj)
{
    console.log(obj[x]);
}











//Strings
let strs=" HI ";
console.log(strs[0]);

//  Template Literal and string interpolation

console.log(`My name is ${obj.name} and i am ${obj.Gender} `);

console.log(strs.toLowerCase());
console.log(strs.toUpperCase());
console.log(strs.trim());


let strs2="Heythisisjs";
console.log(strs2.concat(strs));
console.log(strs2.slice(0,3));
console.log(strs2.charAt(0));
console.log(strs2.replace("H","M"))