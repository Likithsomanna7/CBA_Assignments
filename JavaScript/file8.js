(async function api()
{
    const response=await fetch("https://jsonplaceholder.typicode.com/todos/");
    const data=await response.json()
    for(let x of data)
    {
            document.writeln(x.userId);
            document.writeln(x.id);
            document.writeln(x.title);
            document.writeln(x.completed);
            document.writeln("</br>");


    }
})()
