import java.util.Random;
import java.util.*;


public class prog3

{

    static float[] sort(float[] sequence, float maxValue)

    {

        // Bucket Sort

        float[] Bucket = new float[(int)(maxValue*100000) + 1];

        float[] sorted_sequence = new float[sequence.length];
	for (int i = 0; i < sequence.length; i++)

            sequence[i]=sequence[i]*100000;

        long st = System.nanoTime();

        for (int i = 0; i < sequence.length; i++)

            Bucket[(int)(sequence[i])]++;



        int outPos = 0;

        for (int i = 0; i < Bucket.length; i++)

            for (int j = 0; j < Bucket[i]; j++)

                sorted_sequence[outPos++] = i;

        long et = System.nanoTime();
        System.out.println("\nRunning Time: "+(et-st));
	return sorted_sequence;
	}
  
  public static void main(String a[])
  {
    System.out.println("\nenter size: ");
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    Random r = new Random();
    float arr[] = new float[n];
    System.out.print("\nUnsorted Array :");
    for(int i = 0; i < n ; i++)
    { arr[i] = r.nextFloat();
      System.out.print(arr[i]+"\t");
    }
    System.out.println();
    arr=sort(arr,n);
    System.out.print("\n\nSorted Array   :");
     for(int i = 0; i < n ; i++)
    {
      System.out.print(arr[i]/100000+"\t");
    }
    System.out.println();
  }
}
