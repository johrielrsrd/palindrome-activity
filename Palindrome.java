import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Please provide an input: ");
        String input = scan.nextLine().toLowerCase();
        scan.close();

        StringBuilder sb = new StringBuilder(input).reverse();
        String str = sb.toString();

        String result = input.equals(str) ? "a palindrome" : "not a palindrome";

        System.out.println("The input you have provided is " + result + ".");
    }
}