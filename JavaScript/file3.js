let arr=["Ram",18,"Raju",88]
for(let x of arr)
{
    console.log(x)
}

arr.push("Raju");
arr.pop();

console.log(arr)
arr.unshift(0);
console.log(arr);
arr.shift();
console.log(arr);

//splice
        //start,howmany,insertnew
arr.splice(1,1,18);
console.log(arr);