import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        int number, reversed = 0, temp;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number = sc.nextInt();

        temp = number;  // store original number

        // reverse the number
        while (number != 0) {
            int digit = number % 10;        // get last digit
            reversed = reversed * 10 + digit; // add digit to reversed number
            number = number / 10;           // remove last digit
        }

        // check palindrome
        if (temp == reversed)
            System.out.println(temp + " is a Palindrome number.");
        else
            System.out.println(temp + " is not a Palindrome number.");
    }
}