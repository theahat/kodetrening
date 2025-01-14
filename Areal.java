public class Areal {
    int bredde;
    int hoyde;
    public Areal (int bredde, int hoyde){
        this.bredde=bredde;
        this.hoyde=hoyde;
    }

    int regnAreal() {
        return bredde*hoyde;

    }
    public static void main(String[] args) {
        Areal areal = new Areal(10,  20);
        System.out.println(areal.regnAreal());
    }
}
