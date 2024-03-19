import java.util.*;

public class NumberGame {
	public static void main(String[] args) {		
	Scanner sc=new Scanner(System.in);
	int score=0;
	boolean nextround=true;
	while(nextround) {
	int num=(int) ((Math.random()*100)+1);
	int i=0,k = 5;
	System.out.println("Choosen number between 1 to 100"+num);
	    for(i=0;i<k;i++)
		 {
		System.out.println("Enter Guess number");
		int guess=sc.nextInt();
		sc.nextLine();
		if(num==guess) {
		System.out.println("you guessed the number"+guess);
		score++;
		break;
		}
		else if(num<guess) {
			System.out.println("the guess number is greater");
		}
		else {
			System.out.println("the guess number is lesser");
		}
		}
		if(i>=k) {
			System.out.println("you have exhausted k trial. The number was"+num);
		}
			
	System.out.println("Do you want Guess again Enter yes/no");
	String nextroundInput=sc.nextLine();
	nextround=nextroundInput.equalsIgnoreCase("yes");
	}
	System.out.println("Game over"+score);
	}
}
