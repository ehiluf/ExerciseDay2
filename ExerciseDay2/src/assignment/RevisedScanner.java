package assignment;
import java.util.Scanner;

public class RevisedScanner {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your age:");
		int age=input.nextInt();
		{
		System.out.println("Your age is:" + age);
		}
		if(age >=18) {
		System.out.println("eligible to vote");
		}
		else if (age<=18) {
		System.out.println("not eligble to vote");
		}
	}

}
