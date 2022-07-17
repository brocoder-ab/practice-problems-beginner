package basics;
import java.util.Scanner;
public class MutiplyNbyN {
	public static void main(String[]arg) {
		int inputNumber, stepNumber;
		Scanner s = new Scanner(System.in);
		inputNumber = s.nextInt();
		stepNumber = inputNumber;
		int i = 1;
		while (i<=10) {
			int multiples = i * inputNumber;
			System.out.println(multiples);
			i++;
		}	
	}
}
