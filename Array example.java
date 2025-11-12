// Example of Array in Java
public class ArrayExample {
    public static void main(String[] args) {
        
        // Declare and initialize an array
        int[] numbers = {10, 20, 30, 40, 50};
        
        // Display array elements
        System.out.println("Array elements are:");
        for(int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + " = " + numbers[i]);
        }
        
        // Calculate sum of array elements
        int sum = 0;
        for(int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("Sum of all elements = " + sum);
    }
}
