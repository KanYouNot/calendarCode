import java.io.*;
import java.util.*;

public class Day1Input {
    public static void main(String[] args) {
        // Path to the input file (adjust accordingly)
        String filePath = "input.txt";
        
        // Lists to store the two columns
        List<Integer> column1 = new ArrayList<>();
        List<Integer> column2 = new ArrayList<>();
        
        // Reading from the file
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            
            // Read the entire file line by line
            while ((line = reader.readLine()) != null) {
                String[] numbers = line.split("\\s+");  // Split by spaces or tabs
                for (int i = 0; i < numbers.length; i++) {
                    if (i % 2 == 0) {
                        column1.add(Integer.parseInt(numbers[i]));  // Even index for column 1
                    } else {
                        column2.add(Integer.parseInt(numbers[i]));  // Odd index for column 2
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Convert lists to arrays
        int[] array1 = column1.stream().mapToInt(i -> i).toArray();
        int[] array2 = column2.stream().mapToInt(i -> i).toArray();
        
        // Output the arrays for verification
        System.out.println("Array 1: " + Arrays.toString(array1));
        System.out.println("Array 2: " + Arrays.toString(array2));
    }
}

