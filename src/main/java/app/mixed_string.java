package app;

import java.util.Random;

public class mixed_string {
    public static void main(String[] args) {
        Random random  = new Random();
        StringBuilder CV = new StringBuilder();
        StringBuilder SV = new StringBuilder();
        StringBuilder CC = new StringBuilder();
        StringBuilder SC = new StringBuilder();
        StringBuilder general = new StringBuilder();
        String C_V = "AIEOU";
        String S_V = "aieou";
        int value;
        for(int i = 0; i < 30; i++) // generating
        {
            value = random.nextInt(51);
            if(value<=26)
            {
                general.append((char)(value + 65)); //generating
            }
            else
                general.append(((char) ((value - 26) + 97))); //generating
        }
        for (int i = 0; i < 30; i++) {
            if((int)(general.toString().charAt(i)) >= 97){
                if (S_V.contains(String.valueOf(general.toString().charAt(i))))
                    SV.append(general.toString().charAt(i));
                else
                    SC.append(general.toString().charAt(i));
            }
            else
            {
                if(C_V.contains(String.valueOf(general.toString().charAt(i))))
                    CV.append(general.toString().charAt(i));
                else
                    CC.append(general.toString().charAt(i));
            }
        }
        System.out.println("General String: " + general.toString());
        System.out.println("Capital Vowels: " + CV.toString());
        System.out.println("Small Vowels: " + SV.toString());
        System.out.println("Capital Consonants: " + CC.toString());
        System.out.println("Small Consonants: " + SC.toString());
    }
}
