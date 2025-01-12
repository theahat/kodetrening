import java.util.Scanner;

class SkattiRuritania {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            double inntekt = in.nextDouble();
            if (inntekt<10000) {
                System.out.println(inntekt*0.10);
            }
            else {
                double overskudd = inntekt-10000;
                System.out.println((10000*0.10)+(overskudd*0.30));
            }
        }
    }
}