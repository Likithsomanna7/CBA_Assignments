import java.util.*;
public class selectionsort
{
    public static void sort(int arr[])
    {
    
        for(int i=0;i<arr.length-1;i++)
        {
            int minindex=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]<arr[minindex])
                {
                    minindex=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[minindex];
            arr[minindex]=temp;
        }

    }

    public static void display(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+"\t");
        }
    }

    public static void main(String args[])
    {
        int arr[]={3,5,1,2,4};
        sort(arr);
        System.out.println("Array After Selection Sort is "+"\n");
        display(arr);
    }
}