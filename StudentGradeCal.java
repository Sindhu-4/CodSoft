import java.util.Iterator;
import java.util.Scanner;

public class StudentGradeCal {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number of subjects");
		int numsub=sc.nextInt();
		int totalmarks=0;
		for (int i = 1; i<=numsub;i++) {
        System.out.println("Enter marks obtained in subjects"+i);
        int marks=sc.nextInt();
        totalmarks+=marks;
		}
		float avgpercent=totalmarks/numsub;
		char grade;
		if(avgpercent>=90) {
			grade='A';
		}
		else if(avgpercent>=80) {
			grade='B';
		}else if(avgpercent>=70) {
			grade='C';
		}else if(avgpercent>=60) {
			grade='D';
		}
		else {
			grade='F';
		}
		System.out.println("Totalmarks"+totalmarks);
		System.out.println("Average percentage:"+avgpercent+":");
		System.out.println("Grade:"+grade);
	}
}
