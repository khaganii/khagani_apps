package app;

import java.util.Arrays;
import java.util.Random;

public class shifting_positive_numbers {
    public static void main(String[] args) {
        int arr[] = new int[10];
        Random random = new Random();
        for (int i = 0; i < 10; i++) { //filling
            arr[i] = random.nextInt(20)-10;
        }
        System.out.println("First array: " + Arrays.toString(arr));
        int current = 0;
        int last = 0;
        int counter = 0;
        int first_ind = 0;
        for (int i = 0; i < 10; i++) {
            if(arr[i] >= 0)
            {
                if(counter != 0)
                {
                    current = arr[i];
                    arr[i] = last;
                    last = current;
                }
                else{
                    first_ind = i;
                    last = arr[i];
                }
                counter++;
            }
        }
        arr[first_ind] = current;
        System.out.println("Next array: " + Arrays.toString(arr));
    }
}
