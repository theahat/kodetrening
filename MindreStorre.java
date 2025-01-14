import java.util.*;

class MindreStorre {
    public static void main(String[] args) {
        int tall;
        try (Scanner tastatur = new Scanner(System.in)) {
            while(true){
                System.out.println("Tast inn et tall:");
                tall = Integer.parseInt(tastatur.nextLine());
                if(tall < 10) {
                    System.out.println("Tallet er under 10");
                } else if(tall >= 10 && tall <= 20) {
                    System.out.println("Tallet er mellom 10 og 20");
                } else {
                    System.out.println("Tallet er over 20");
                }
            }
        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
