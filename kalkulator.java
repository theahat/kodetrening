import java.util.*;

public class kalkulator {

    static int power(int N, int P) {
        if (P == 0)
            return 1;
        else
            return N * power(N, P - 1);
    }

    public static void main(String[] args) {

        int tall1;
        int tall2;
        String oper;
        boolean svar = true;
        try (Scanner tastatur = new Scanner(System.in)) {
            while (svar) {
                System.out.println("Tall nr 1:");
                tall1 = Integer.parseInt(tastatur.nextLine());
                System.out.println("Tall nummer 2:");
                tall2 = Integer.parseInt(tastatur.nextLine());
                System.out.println("Velg operatør: +, -, *, /, eller ^");
                oper = tastatur.nextLine();
                if (oper.equals("+")) {
                    System.out.println(tall1 + tall2);
                } else if (oper.equals("-")) {
                    System.out.println(tall1 - tall2);
                } else if (oper.equals("*")) {
                    System.out.println(tall1 * tall2);
                } else if (oper.equals("/")) {
                    System.out.println(tall1 / tall2);
                } else if (oper.equals("^")) {
                    System.out.println(power(tall1, tall2));
                } else {
                    System.out.println("Operatør er ugyldig.");
                }
                System.out.println("Vil du fortsette? ja/nei");
                if (tastatur.nextLine().equals("nei")) {
                    svar = false;
                }
            }
        }
    }
}
