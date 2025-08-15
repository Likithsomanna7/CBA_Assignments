import java.util.*;
class file1
{
    public static void main(String args[])
    {
       // Primitive datatypes
       byte a=127;  //1  bytes
       short b=96;  //2 bytes
       int c=1000;  //4 bytes
       long d=19383;  //8 bytes
       float e=12.5f;   //4 bytes
       double f=134;    //8 bytes
        System.out.println(a+"\n"+b+"\n"+c+"\n"+d+"\n"+e+"\n"+f);

    
        //type conversion  lower to higher is possible but higher to lower not possible 

        b=a; //possible
        a=(byte)b;//stores the mod value


        //  operators Arithmetic
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);

        //  Relational Operators
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a>=b);
        System.out.println(a<=b);
        System.out.println(a==b);

        //logical operator

        System.out.println(1==1 && 1==1);
        System.out.println(2==2 || 3==1 );
        System.out.println(!(2==2 || 3==1) );
        System.out.println(2==2 ^ 3==1 );


       
    }
}
