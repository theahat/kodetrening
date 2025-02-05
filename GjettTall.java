import java.util.Scanner;

public class GjettTall {
    public static void main(String[] args) { 
        int tallet = (int)(Math.random() * 101);
        int svar;
        boolean res=false;
        int antallSvar=0;
        try (Scanner tastatur = new Scanner(System.in)) {
            while (!res) {
                if (!tastatur.hasNextInt()){
                    System.out.println("Svaret må være et tall mellom 0 og 100! Prøv igjen.");
                    tastatur.next();
                    continue;
                }
                svar = Integer.parseInt(tastatur.nextLine());
                if (svar<0 || svar>100){
                    System.out.println("Tallet må være mellom 0 og 100! Prøv igjen");
                }
                else if (svar<tallet) {
                    System.out.println("For lavt!");
                }
                else if (svar>tallet){
                    System.out.println("For høyt");
                }
                else if (svar==tallet){
                    System.out.println("Korrekt! Svaret var "+ tallet + "\nDu prøvde totalt "+antallSvar+" ganger.");
                    res=true;
                }
                antallSvar+=1;
            }
        }
    }
}
