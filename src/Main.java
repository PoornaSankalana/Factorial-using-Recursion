import java.util.Scanner;

public class Main {

    public static int factorial(int n){
        if(n == 0){
            return 1;
        } else {
            return (n * factorial(n-1));
        }
    }

    public static void main(String[] args) {
        // taking a keyboard input
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter an Integer: ");
        int factorialNumber = keyboard.nextInt();

        int factor = factorial(factorialNumber);

        System.out.println("Factorial: " + factor);

    }
}

