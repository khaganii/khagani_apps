package app;

import java.util.Scanner;

public class array_sequence_numbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int width = in.nextInt(), height = in.nextInt();
        int a [][] = new int[height][width];
        int k = 0;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if(j < width-j){
                    k++;
                    a[i][j] = k;
                }
                else if(j == width-j) a[i][j] =k;
                else {
                    k--;
                    a[i][j] = k;
                }
            }
            k=0;
        }
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }
}
