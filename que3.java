import java.util.Scanner;

public class que3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        try {
            if (number < 0) {
                throw new IllegalArgumentException("Number cannot be negative");
            }

            System.out.println("Entered number: " + number);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
