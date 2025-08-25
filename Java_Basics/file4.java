import java.util.*;
class DS
{
    int[][] arr=new int[5][3];
    public void arrayoperations()  //Arrays
    {
        //Jagged Array  int arr[][]= new int[2][]; 
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Array Elements\n");
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Array After Insertion is\n");
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
    public  void strings()
    {
        String str="Likith";  //stored in Constant String Pool
        System.out.println(str);
        str=str+"Somanna";    // Likith Somanna is created as a seperate object and new reference 
                            // is assigned to str .the old gets removed by Garbage Collection 
        System.out.println(str);
        String str1="Joe";
        String str2="Joe";      //Same reference of the object as that of str1 beacuse same name
        System.out.println(str1==str2);
    }
    public void stringbuffer()  //thread Safe  but string builder Not
    {
        StringBuffer stb=new StringBuffer("Likith");
        stb.append("Somanna");
        System.out.println(stb);
    }
}
class file4
{
    public static void main(String[] args)
    {
        DS obj1=new DS();
        obj1.arrayoperations();
        obj1.strings();
        obj1.stringbuffer();
        
    }
}