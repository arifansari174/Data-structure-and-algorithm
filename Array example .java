public class ArrayExample {
    public static void main(String[] args) {

        // Step 1: Create an array of numbers
        int[] numbers = {10, 20, 30, 40, 50};

        // Step 2: Show all numbers
        System.out.println("The numbers in array are:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // Step 3: Find the total sum
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }

        // Step 4: Show the total
        System.out.println("Total sum = " + sum);
    }
}
