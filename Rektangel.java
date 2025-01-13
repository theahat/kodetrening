public class Rektangel {

    private double lengde;
    private double bredde;
    public Rektangel (double l, double b) {   // Konstruktør
        lengde = l;
        bredde = b;
    }
  
    public void oekLengde (int okning) {    // Oek lengden som angitt
    }
  
    public void oekBredde (int okning) {    // Oek bredden som angitt
    }
  
    public double areal () {     // Beregn mitt areal
        return lengde*bredde;
    }
  
    public double omkrets () {   // Beregn min omkrets
        return lengde+lengde+bredde+bredde;
    }
    public static void main(String[] args) {
        Rektangel rektangel1 = new Rektangel(10, 10);
        Rektangel rektangel2 = new Rektangel(4, 6);
        System.out.println(rektangel1.areal());
        System.out.println(rektangel2.areal());
        rektangel1.oekLengde(4);
        rektangel2.oekBredde(2);
        System.out.println(rektangel1.omkrets());
        System.out.println(rektangel2.omkrets());
    }
}
