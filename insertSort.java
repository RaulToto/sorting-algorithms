import javax.print.event.PrintJobListener;

class InsertionSort
{
    void sort(int arr[])
    {
        int n = arr.length;
        for (int i=1; i<n; ++i)
        {
            int key = arr[i];
            int j = i-1;
 
            while (j>=0 && arr[j] > key)
            {
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }
    }
 
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
 
        System.out.println();
    }
 
    public static void main(String args[])
    {        
        int arr[] = {11,-4,5,26,70,49,33,17};
        System.out.print("Array \n");
        printArray(arr);
        InsertionSort ob = new InsertionSort();        
        ob.sort(arr); 
        System.out.print("\n Sorted Array\n");        
        printArray(arr);
    }
} 