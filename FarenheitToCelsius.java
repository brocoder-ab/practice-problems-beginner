package basics;
import java.util.Scanner;
public class FarenheitToCelsius {

	public static void main(String[] args) {
		int S, E, W;  // S is starting Fahrenheit number for which Celsius will be converted
		Scanner s = new Scanner(System.in);
		S = s.nextInt();
		E = s.nextInt(); // E is the end Fahrenheit number 
		W = s.nextInt(); // step size for the next number
		
		if (S>=0 && S<=90 && 
		    E>=S && E<=900 && 
		    W>=0 && W<=80) {
		int i = S;
		while (i<=E) {
			int celsius = ((i-32) * 5)/9;
			System.out.println(i + " " + celsius);
			i += W;
		}
		}
		else {
			System.out.println("Please input S between 0 and 90;\n" + "E between S and 900;\n" + "W between 0 and 80" );
		}
		

	}

}
