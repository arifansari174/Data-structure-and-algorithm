import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        boolean isPrime = true;  // assume the number is prime

        if (num <= 1) {
            isPrime = false;  // numbers less than or equal to 1 are not prime
        } else {
            // check from 2 to num/2
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {  // if divisible by any number
                    isPrime = false; // not a prime number
                    break;
                }
            }
        }

        // print result
        if (isPrime)
            System.out.println(num + " is a Prime Number.");
        else
            System.out.println(num + " is not a Prime Number.");
    }
}