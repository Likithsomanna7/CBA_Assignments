class StaticMethods 
{
    static int  age =21;
    int ages=21;
    static
    {
        System.out.println("Inside a static block"); //automatically created when the class 
                                                    // is loaded and then the Constructor
    }
    public static int year()
    {

        return 2025-age;
    }
    public int year1()
    {
        return 2025-ages;
    }
}
class file5
{
    public static void main (String args[])
    {
    
        System.out.println(StaticMethods.age); //static variables and methods
        System.out.println(StaticMethods.year());
        StaticMethods.age=25;
        System.out.println(StaticMethods.year()); //static variables and methods which are global scoped
        StaticMethods obj1=new StaticMethods();
        StaticMethods obj2=new StaticMethods();
        System.out.println(obj1.ages);
        System.out.println(obj1.year1());
        System.out.println(obj2.ages);  // Instance Variable without static are local Scoped 
        System.out.println(obj2.year1());
        obj1.ages=22;
        System.out.println(obj1.ages);
        System.out.println(obj1.year1());
        System.out.println(obj2.ages);
        System.out.println(obj2.year1());


    }
}