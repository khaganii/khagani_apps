package app;

public class alphabet {
    public static void main(String[] args) {
        System.out.printf("Alphabet: ");
        for (int i = 0; i < 26; i++) {
            System.out.printf(String.valueOf((char)(i + 65)));
            System.out.printf(" ");
        }

    }
}
