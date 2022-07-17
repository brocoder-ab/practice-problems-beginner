package basics;
import java.util.Scanner;

public class TotalSalary {
	public static void main (String[] arg) {
		int basicSalary, totalSalary, gradeA, gradeB, gradeC;
		float hra, da,pf;
		char grade; 
		Scanner s = new Scanner(System.in);
		basicSalary = s.nextInt();
		grade = s.next().charAt(0);
		hra = (float)(basicSalary*(20.0f/100.0f)); //2000
		da = (float)(basicSalary*(50.0f/100.0f)); //5000
		pf = (float)(basicSalary*(11.0f/100.0f)); //1100
		gradeA = 1700; gradeB = 1500; gradeC= 1300;
		if ((basicSalary >= 0) && (basicSalary <= 7500000)) {
				if (grade == 'A') {
					totalSalary = Math.round(basicSalary + hra + da + gradeA - pf);
					System.out.println(totalSalary);
				}else if (grade == 'B') {
					totalSalary = Math.round(basicSalary + hra + da + gradeB - pf);
					System.out.println(totalSalary);
				}else {
					totalSalary = Math.round(basicSalary + hra + da + gradeC - pf);
					System.out.println(totalSalary);
				}
		}
		else {
			System.out.println("Please input a basic salary between 0 and 7500000");
		}
	}
}

// (basicSalary >= 0) && (basicSalary <= 7500000)
