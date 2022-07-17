package basics;
import java.util.Scanner;
public class PowerofaNumber {
	public static void main(String[]arg) {
		int baseNumber, stepNumber, power;
		Scanner s = new Scanner(System.in);
		baseNumber = s.nextInt();
		power = s.nextInt();
		if (baseNumber >= 0 && baseNumber <= 8 &&
			power > 0 && power <= 9) {
			int i = 1;
			stepNumber = baseNumber;
			while(i<power) {
				baseNumber = baseNumber * stepNumber;
				i++;
			}
			
		}
//		else if ((baseNumber = 0) && (power = 0)) {
//			baseNumber = 1;
//			System.out.println(baseNumber);
//		}
		else {
			baseNumber = 1;
		}
		System.out.println(baseNumber);
	}
}
