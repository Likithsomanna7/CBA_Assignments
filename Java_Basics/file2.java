public class file2
{
    public static void main(String args [])
    {
        // conditional statements
        int num1 = 34 ,num2 =21 , num3=15; 
        if(num1>num2 &&num1>num3)
        {
            System.out.println(num1 +" : is greater");
        }
        else if(num2>num3)
        {
             System.out.println(num2 +" : is greater");
        }
        else
        {
             System.out.println(num3 +" : is greater");
        }
        //  ternary operator
        int result=(num1>num2 &&num1>num3)?num1:((num2>num3)?num2 :num3 );
        System.out.println(result+" : is greater");


        //switch operator
        int age=18;
        switch(age)
        {
            case 18:System.out.println("You are 18");
                    break;
            case 19:System.out.println("You are 18");
                    break;
            default :System.out.println("Nice to know");
                    break;
        }
        // while loop
        int i=0;
        while(true)
        {
            if(i==10)
            {
                System.out.println("About to exit");
                break;
            }
            System.out.println(i);
            i++;
        }

        // do While loop
        do 
        {
            System.out.println("Exited");
        } while(i!=10);

        //for loop

        for(int j=0;j<5;j++)
        {
            for(int k=0;k<=j;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}