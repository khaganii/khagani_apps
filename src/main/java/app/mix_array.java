package app;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class mix_array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        int n = in.nextInt();
        int [] ar1 = new int[n];
        int [] ar2 = new int[n];
        int [] ar3 = new int[n];
        int [] arr_end = new int[3*n];
        for(int i = 0; i<n; i++){
            ar1[i] = random.nextInt(10) * 2;
            ar2[i] = random.nextInt(10) * 7;
            ar3[i] = random.nextInt(10) * 11;
        }
        
        for (int i = 0; i < (3*n); i++) { //mine
            if((i+1)%3 == 1) arr_end[i] = ar1[i/3];
            if((i+1)%3 == 2) arr_end[i] = ar2[i/3];
            if((i+1)%3 == 0) arr_end[i] = ar3[i/3];
        }

//        for (int i = 0; i < n; i++) { //PhD
//            arr_end[i*3] = ar1[i];
//            arr_end[i*3+1] = ar2[i];
//            arr_end[i*3+2] = ar3[i];
//        }


        String one = Arrays.toString(ar1);
        String two = Arrays.toString(ar2);
        String three = Arrays.toString(ar3);
        String total = Arrays.toString(arr_end);
        System.out.println("ar1: " + one);
        System.out.println("ar2: " + two);
        System.out.println("ar3: " + three);
        System.out.println("arr_end: " + total);

    }
}
