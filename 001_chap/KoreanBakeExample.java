public class KoreanBakeExample {
    public static void main(String args[]) {
        System.out.println("Start Bake\n-------\n");
        KoreanBake squareBake = new KoreanBake("square", 25);
        KoreanBake circleBake = new KoreanBake("circle", 25);

        boolean result = squareBake.isGoodFee(circleBake);
        if(result == true) {
            System.out.println("Good");
        }
        else {
            System.out.println("Bad");
        }
    }
}