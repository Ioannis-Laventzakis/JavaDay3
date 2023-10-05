import java.util.Random;

public class NumberChecker {
    public static void main(String[] args) {
        Random rng = new Random();

        int n = rng.nextInt(100);
        System.out.println("The random number is " + n);

        if (n == 25) {
            System.out.println("N's lucky number is 25");
        } else if (n > 25) {

            System.out.println("*************************");
            System.out.println();
            // Does anyone know what I mean when I say  "if statements can be nested"
            // Inside the if, you can write another if
            if (n > 10){
                System.out.println(" N is not small");
                // Nested if statement
                if (n > 33){
                    System.out.println("N is Fairly big");
                    if (n > 50){

                    }
                }
            }
        }
    }
}
