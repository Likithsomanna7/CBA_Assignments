let flag=0;
function function1()
{
    let obj=document.querySelector(".div1")
    if(flag==0)
    {
    obj.style.backgroundColor= "#D8D7C7";
    obj.style.border="10px solid #C0C0C0";
    document.body.style.backgroundColor="#060623ff"
    flag=1;
    }
    else
    {
    obj.style.backgroundColor= "yellow";
    obj.style.border="10px solid rgb(225, 154, 95)";
    document.body.style.backgroundColor=" rgb(220, 220, 198)"
    flag=0;
    }

}