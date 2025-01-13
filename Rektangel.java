public class Rektangel {

    private double lengde;
    private double bredde;
    public Rektangel (double lengde, double bredde) {   // Konstruktør
        this.lengde = lengde;
        this.bredde = bredde;
    }
  
    public void oekLengde (double okning) {    // Oek lengden som angitt
        lengde = lengde+okning;
    }
  
    public void oekBredde (double okning) {    // Oek bredden som angitt
        bredde+=okning;
    }

    public void minkeLengde (double minking) {    // Oek lengden som angitt
        lengde = lengde-minking;
    }
  
    public void minkeBredde (double minking) {    // Oek bredden som angitt
        bredde-=minking;
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
        rektangel1.minkeBredde(6);
        rektangel2.minkeLengde(7);
        System.out.println(rektangel1.omkrets());
        System.out.println(rektangel2.omkrets());
    }
}
