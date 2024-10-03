import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		System.out.println("Please type in your name");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		System.out.println("Hello " + name);
		System.out.println("Please type in your age");
		int age = scanner.nextInt();
		System.out.println("Your are " + age + " years old!");
		int yearsLeft = 67 - age;
		System.out.println("You have " + yearsLeft + " left until retirement!");
	}
}