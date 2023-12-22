import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.print("How many numbers? ");
		int N = input.nextInt();
		int sum = 0;
		
		for (int i=0; i<N; i++) {
			System.out.print("Input a number: ");
			int x = input.nextInt();
			sum = sum + x;
		}
		
		System.out.println("Sum: " + sum);
		
		input.close();
	}

}
