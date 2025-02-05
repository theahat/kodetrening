import java.util.Scanner;

public class GjettTall {
    public static void main(String[] args) { 
        int tallet = (int)(Math.random() * 101);
        int svar;
        boolean res=true;
        int antallSvar=0;
        try (Scanner tastatur = new Scanner(System.in)) {
            while (res) {
                svar = Integer.parseInt(tastatur.nextLine());
                if (svar==tallet) {
                    System.out.println("Korrekt! Svaret var "+ tallet+"\nDu prøvde totalt "+antallSvar+" ganger.");

                    res=false;
                }
                else {
                    if (svar<tallet) {
                        System.out.println("For lavt!");
                    }
                    else if (svar>tallet){
                        System.out.println("For høyt");
                    }
                    antallSvar+=1;
                }
            }
        }
    }
}
