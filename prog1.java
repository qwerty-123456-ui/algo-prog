import java.util.Random;
import java.util.*;

class prog1
{
  public static void InsertionSort(int arr[], int n)
  {
    int i, k, j;
    for (i = 1; i < n; i++)
    {
        k = arr[i];
        j = i - 1;
        while (j >= 0 && arr[j] > k)
        {
            arr[j + 1] = arr[j];
            j = j - 1;
        }
        arr[j + 1] = k;
    }
  }
  public static void main(String a[])
  {
    System.out.println("\nenter size: ");
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    Random r = new Random();
    int arr[] = new int[n];
    System.out.print("\nUnsorted Array :");
    for(int i = 0; i < n ; i++)
    { arr[i] = r.nextInt(2000);
      System.out.print(arr[i]+"\t");
    }
    System.out.println();
    long st = System.nanoTime();
    InsertionSort(arr,n);
    long et = System.nanoTime();
    System.out.print("\nRunning Time : "+(et-st)+"\n\nSorted Array   :");
     for(int i = 0; i < n ; i++)
    { 
      System.out.print(arr[i]+"\t");
    }
  }
}
