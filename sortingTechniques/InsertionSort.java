class InsertionSort
{
    public static void sort(int arr[])
    {
        for(int i=1;i<arr.length;i++)
        {
            int key =arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key)
            {
                arr[j+1]=arr[j];
                j-=1;
            }
            arr[j+1]=key;
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
        int arr[]={4,2,1,3};
        sort(arr);
        System.out.println("Array After InsertionSort is\n");
        display(arr);
    }
}