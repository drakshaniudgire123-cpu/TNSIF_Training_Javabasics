package palindrome;
import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		int number;
		System.out.println("Enter the number:");
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();
		int reversedNumber = 0,temp = number;
		while(temp > 0) {
			int remainder = temp % 10;
			reversedNumber = reversedNumber * 10  +  remainder;
			temp = temp / 10;
		}
		if(number == reversedNumber)
			System.out.println("Number is palindrome");
		else
			System.out.println("Number is not palindrome");
		// TODO Auto-generated method stub

	}

}
