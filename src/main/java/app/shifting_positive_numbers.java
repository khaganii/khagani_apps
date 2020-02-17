package app;

import java.util.Arrays;
import java.util.Random;

public class shifting_positive_numbers {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int[] pos = new int[10];
        Random random = new Random();
        int counter = 0;
        for (int i = 0; i < 10; i++) { //filling
            arr[i] = random.nextInt(20)-10;
            if(arr[i] >= 0){
                pos[counter+1] = arr[i];
                counter++;
            }
        }
        if (counter >=1)
        {

        }
        System.out.println("First array: " + Arrays.toString(arr));
        System.out.println(counter);
        System.out.println(pos[0]);
        pos[0] = pos[counter-1];
        pos[counter-1] = 0;
        System.out.println(Arrays.toString(pos));
        counter = 0;
        for (int i = 0; i < 10; i++) {
            if(arr[i] >= 0) {
                arr[i] = pos[counter];
                counter++;
            }
        }
        System.out.println("First array: " + Arrays.toString(arr));




        System.out.println("Next array: " + Arrays.toString(arr));
    }
}
