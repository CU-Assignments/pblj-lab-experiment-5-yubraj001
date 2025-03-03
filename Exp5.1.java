import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AutoboxingUnboxingSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        
        System.out.println("Enter numbers (type 'done' to finish):");
        while (scanner.hasNext()) {
            String input = scanner.next();
            if (input.equalsIgnoreCase("done")) {
                break;
            }
            try {
                numbers.add(parseInteger(input)); 
            } catch (NumberFormatException e) {
                System.out.println("Invalid number format: " + input);
            }
        }
        
        scanner.close();
        
        // Calculate the sum
        int sum = calculateSum(numbers);
        
        // Display the result
        System.out.println("The sum of the numbers is: " + sum);
    }
    
    // Method to parse string into Integer
    public static Integer parseInteger(String str) {
        return Integer.parseInt(str); 
    }
    
    // Method to calculate the sum
    public static int calculateSum(List<Integer> numbers) {
        int sum = 0;
        for (Integer num : numbers) {
            sum += num; 
        }
        return sum;
    }
}



