package app;

import java.util.Random;

public class sum_of_array {
    public static void main(String[] args) {
        int [] arr1 = new int[20];
        int [] arr2 = new int[30];
        int oddsum = 0;
        int evensum = 0;

        Random random = new Random();
        //random.nextInt(high - low) + low;
        System.out.println("elements of array1: ");
        for (int i = 0; i<20; i++)
        {
            while (true)
            {
                int k = random.nextInt(20 + 20) - 20;
                if (k % 2 == 0) {
                    arr1[i] = k;
                    break;
                }
            }
            evensum = evensum + arr1[i];
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        System.out.println("elements of array2: ");
        for (int i = 0; i<30; i++)
        {
            while (true)
            {
                int k = random.nextInt(30 + 30) - 30;
                if (k % 2 == 1) {
                    arr2[i] = k;
                    break;
                }
            }
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
        System.out.println("sum of odd numbers: " + oddsum);
        System.out.println("sum of even numbers: " + evensum);
        System.out.println("Total Sum: " + (oddsum + evensum));
    }
}
