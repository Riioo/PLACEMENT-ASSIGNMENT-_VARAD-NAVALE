import java.util.Arrays;
import java.util.List;

public class que6 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 2, 8, 3, 1, 9, 4, 6, 7);

        // Sorting the numbers in ascending order
        List<Integer> sortedNumbers = numbers.stream()
                .sorted()
                .toList();

        System.out.println("Sorted numbers: " + sortedNumbers);

        // Filtering even numbers
        List<Integer> evenNumbers = numbers.stream()
                .filter(num -> num % 2 == 0)
                .toList();

        System.out.println("Even numbers: " + evenNumbers);
    }
}