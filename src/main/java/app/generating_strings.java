package app;

import java.util.Random;

public class generating_strings {
    public static void main(String[] args) {
        Random random  = new Random();
        String a = "";
        String v = "";
        String c = "";
        int value;
        for(int i = 1; i < 30; i++) // generating
        {
            value = random.nextInt(26) + 97;
            a = a.concat(Integer.toString(((char) value)));
        }
        char [] ch_arr = a.toCharArray();
        for(int i = 1; i < 30; i++) //filtering
        {
            value = ch_arr[i-1];
            if(     value == 97 ||
                    value == 101 ||
                    value == 105 ||
                    value == 111 ||
                    value == 117 )
                v = v.concat(Integer.toString(((char) value)));

            else c = c.concat(Integer.toString(((char) value)));
        }
        System.out.println("Generating array: " + a);
        System.out.println("Vowel array: " + v);
        System.out.println("Consonant array: " + c);
    }
}
