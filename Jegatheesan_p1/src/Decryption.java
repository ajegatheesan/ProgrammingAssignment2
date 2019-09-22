
import java.util.Scanner;

public class Decryption {
	
	
	public static void main(String[] args) {
	
		int digits, digit1, digit2 , digit3, digit4;
		System.out.println("Please enter a four-digit number:");
		Scanner number = new Scanner(System.in);
		digits = number.nextInt();
		int temp = 0;

		while (digits > 9999 || digits < 0)
		{
			System.out.println("The number you have entered is invalid due to being more or less than four digits.");
			digits = number.nextInt();
		}
		
		
		digit1 = digits%10;
		digits = digits/10;
		digit2 = digits%10;
		digits = digits/10;
		digit3 = digits%10;
		digits = digits/10;
		digit4 = digits%10;
		
		digit1 = (digit1+3)%10;
		digit2 = (digit2+3)%10;
		digit3 = (digit3+3)%10;
		digit4 = (digit4+3)%10;
		
	
		
		System.out.printf("The decrypted number:%d%d%d%d\n", digit2,digit1,digit4,digit3);
	}
	
}