package app;

import java.util.Scanner;

public class envelope {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter height: ");
        int height = in.nextInt();
        System.out.print("enter width: ");
        int width = in.nextInt();
        double distance = (double) width/(double) height;
        int a = 0;
        int t = 0;
        System.out.println(distance);
        for (int i = 1; i <= height; i++) {
            if(i%2 == 0)  a = (int) Math.floor(distance);
            else a = (int) Math.ceil(distance);
            t = t+a;
            for (int j = 1; j <= width; j++) {
                //System.out.println(t);
                if((i == 1 || i == height) || (j == 1 || j == width || j == t | j == (width - t))) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
