import java.util.Scanner;

// Prime number in Java: Prime number is a number that is greater than 1 and divided by 1 or itself only. 
// In other words, prime numbers can't be divided by other numbers than itself or 1. 
// For example 2, 3, 5, 7, 11, 13, 17.... are the prime numbers.
// Note: 0 and 1 are not prime numbers. 
// The 2 is the only even prime number because all the other even numbers can be divided by 2.

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number to be checked: ");
        int num = sc.nextInt();
        int temp = 0;

        for (int i = 2; i <= num-1; i++) {
            if (num % i == 0) {
                temp += 1;
            }
        }
        if (temp > 0) {
            System.out.println(num + " is not a prime number.");
        } else {
            System.out.println(num + " is a prime number");
        }
    }
}
