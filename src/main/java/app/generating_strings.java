package app;

import java.util.Random;

public class generating_strings {
    public static void main(String[] args) {
        Random random  = new Random();
        String a = "";
        String v = "";
        String c = "";
        int value = 0;
        for(int i = 1; i < 30; i++)
        {
            value = random.nextInt(26) + 97;
            a = a + (char) value;
            if(     value == 97 ||
                    value == 101 ||
                    value == 105 ||
                    value == 111 ||
                    value == 117 ){
                v = v + ((char) value);
            }
            else c = c + (char) value;
        }
        System.out.println("Generating array: " + a);
        System.out.println("Vowel array: " + v);
        System.out.println("Consonant array: " + c);
    }
}
