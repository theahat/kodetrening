import java.util.Scanner;

public class Recursive {
    public static void printTriangle(int sideLength) {
        if (sideLength<1) {
            return;
        }
        printTriangle(sideLength-1);
        for (int i = 0; i < sideLength; i++) {
            System.out.print("[]");
        }
        System.out.println("");
    }

    public static void printTriangleMod(int sideLength){
        if (sideLength < 1) {
            return;
        }
        for (int i = 0; i < sideLength; i++) {
            System.out.print("[]");
        }
        System.out.println();
        printTriangleMod(sideLength-1);
    }

    public static int mystery(int n) {
        if (n <= 0) {
            return 0;
        }
        return n + mystery(n - 1);
    }

    public static void nBoxes(int n){
        if (n <= 0){ return; }
        nBoxes(n-1);
        System.out.print("[]");
    }

    public static int countVowel(String str){
        String[] vowels = {"a", "e", "i", "o", "u"};
        String[] myString = str.split("");
        int count = 0;
        for (String string : myString) {
            for (String vowel : vowels) {
                if (string.equals(vowel)) {
                    count++;
                }
            }
        }
        return count;
    }

    public static double readDouble(String prompt){
        System.out.print(prompt + ": ");
        try (Scanner tastatur = new Scanner(System.in)) {
            return tastatur.nextDouble();
        }
    }

    public static String reverse(String str){
        if (str.length()<=1){
            return str;
        }
        String reversed = reverse(str.substring(1)) + str.charAt(0);
        return reversed;
    }
    public static void main(String[] args) {
        //printTriangle(5);
        //printTriangleMod(4);
        //System.out.println(mystery(5));
        //nBoxes(6);
        //System.out.println(countVowel("Hello my friends!"));
        //System.out.println(readDouble("Tast inn et tall"));
        System.out.println(reverse("thea"));
    }
}
