package basics;
import java.util.Scanner;
public class SumofEvenandOdd {
	public static void main(String[]arg) {
		int inputNumber, SumofEven, SumofOdd;
		SumofEven = 0;
		SumofOdd = 0;
		Scanner s = new Scanner(System.in);
		inputNumber = s.nextInt();
		int i = inputNumber;
		int n, rem;
		while (i>0) {
			n = i/10; rem = i%10;
			if (rem%2 == 0) {
				SumofEven = SumofEven + rem;
			}
			else {
				SumofOdd = SumofOdd + rem;
			}
			i = n;
		}
		System.out.println(SumofEven + " " + SumofOdd);		
	}
}
