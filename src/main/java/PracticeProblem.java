import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {

		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
	
	}

	public static void q1() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("In: ");
		String string1 = scanner.nextLine();
		
		System.out.println(string1);
	}

	public static void q2() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("In: ");
		int number1 = scanner.nextInt();
		scanner.nextLine();

		System.out.print("In: ");
		int number2 = scanner.nextInt();
		scanner.nextLine();

		System.out.println(number1 / number2);
		System.out.println(number1 % number2);
	}

	public static void q3() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("In: ");
		String string2 = scanner.nextLine();

		System.out.println(string2 + " was the text you wrote");
	}

	public static void q4() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("In: ");
		int number3 = scanner.nextInt();
		scanner.nextLine();

		System.out.println(number3 * 5);
	}

	public static void q5() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("In: ");
		boolean bool1 = scanner.nextBoolean();
		scanner.nextLine();

		System.out.println(bool1 + " is a boolean");
	}

	public static void q6() {
				Scanner scanner = new Scanner(System.in);

		System.out.print("In: ");
		double double1 = scanner.nextDouble();
		scanner.nextLine();

		System.out.println(double1 - 3.2);
	}

}
