import java.util.Random;

public class Rando {
    public static void main(String[] args) {
        Random rand = new Random(); // Random Number Generator

        int n = rand.nextInt(5);
        System.out.println(n);

    }
}
