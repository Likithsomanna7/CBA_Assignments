import java .util.*;
public class bubblesort
{

    public static void sort(int arry[])
    {
          for(int i=0;i<arry.length-1;i++)
        {
            for(int j=0;j<arry.length-i-1;j++)
            {
                if(arry[j]>arry[j+1])
                {
                    int temp =arry[j+1];
                    arry[j+1]=arry[j];
                    arry[j]=temp;
                }
            }
        }
    }
    public static void display(int arry[])
    {
          for(int i=0;i<arry.length;i++)
        {
            System.out.print(arry[i]+"\t");
        }
    }

    public static void main(String args[])
    {
        int arry[]={4,5,3,2,1};
        sort(arry);
        System.out.println("Array After Applying Bubble Sort is\n");
        display(arry);
    }
}