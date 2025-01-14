class Person {
    private String navn;
    private int alder;
    private Person (String navn, int alder){
        this.navn=navn;
        this.alder=alder;
    }
    public static void main(String[] args) {
        Person pers = new Person("Thea Hatlevold", 24);
        System.out.println(pers.navn+", "+pers.alder);
    }
}
