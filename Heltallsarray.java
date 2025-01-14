class Heltallsarray {
    private static int tall0 = 0;
    private static int tall1 = 1;
    private static int tall2 = 2;
    private static int tall3 = 3;
    private static int tall4 = 4;
    private static int[] numbers = new int[5];
    public static void main(String[] args) {
        for (int i=0;i<5;i++){
            numbers[i]=i;
        }
        for (int i=0;i<5;i++){
            System.out.println(numbers[i]);
        }
    }
}
