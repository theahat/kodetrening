import java.util.Scanner;

public class Sammenlign {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("a");
            int a = in.nextInt();
            System.out.println("b");
            int b = in.nextInt();
            if (a<b) {
                System.out.println("a er mindre enn b");
            }
            else if (b<a){
                System.out.println("b er mindre enn a");
            }
            else {
                System.out.println("tallene er like");
            }
        }
    }
}
