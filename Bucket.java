import java.util.Random;
import java.util.*;

 class Bucket

{

    static int[] sort(int[] sequence, int maxValue)

    {
	     long st = System.nanoTime();


        // Bucket Sort

        int[] Bucket = new int[maxValue + 1];

        int[] sorted_sequence = new int[sequence.length];



        for (int i = 0; i < sequence.length; i++)

            Bucket[sequence[i]]++;



        int outPos = 0;

        for (int i = 0; i < Bucket.length; i++)

            for (int j = 0; j < Bucket[i]; j++)

                sorted_sequence[outPos++] = i;
	long et = System.nanoTime();
    System.out.println("\nRunning Time : "+(et-st));

        return sorted_sequence;

 }



    static void printSequence(int[] sorted_sequence)

    {

        for (int i = 0; i < sorted_sequence.length; i++)

            System.out.print(sorted_sequence[i] + " ");

    }



    static int maxValue(int[] sequence)

    {

        int maxValue = 0;

        for (int i = 0; i < sequence.length; i++)

            if (sequence[i] > maxValue)

                maxValue = sequence[i];


        return maxValue;


    }



    public static void main(String args[])
 {

        System.out.println("Sorting of randomly generated numbers using BUCKET SORT");

        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements: ");
        int n = sc.nextInt();

        int[] sequence = new int[n];



        for (int i = 0; i < n; i++)

            sequence[i] = Math.abs(random.nextInt(10000));



        int maxValue = maxValue(sequence);



        System.out.println("\nOriginal Sequence: ");

        printSequence(sequence);

        System.out.println("\nSorted Sequence: ");

        printSequence(sort(sequence, maxValue));

    }
}
