import java.util.*;
public class Task1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		int maxAttempt = 10;
		int rounds = 0;
		int score = 0 ;
		int lowerbound = 1;
		int higherbound = 100;
		System.out.println("Welcome to the Number Guessing Game");
		String playAgain ="";
		do {
			int target = rand.nextInt(100);
			System.out.println("Round"+(rounds+1)+": Enter the number between "+lowerbound+" and " + higherbound +" : ");
			for(int attempt=1; attempt<=maxAttempt; attempt++) {
				int n = sc.nextInt();
				if(n==target) {
					System.out.println("\nHurray you won the match and the no is "+n+" in "+attempt+"attempts.");
					score=score+attempt;
					break;
				}else if(n>target) {
					System.out.println("Entered Value too high");
				}else {
					System.out.println("Entered Value too low");
				}
				if (attempt == maxAttempt) {
                    System.out.println("\nSorry, you've reached the maximum number of attempts. The correct number was: " + target);
                }
			}
			
			System.out.print("Do you want to play again? (yes/no): ");
            playAgain = sc.next().toLowerCase();
            if (playAgain.equals("yes")) {
                rounds++;
            } else {
                System.out.println("Thanks for playing! Your total score is: " + score);
            }
			
		}while(playAgain.equals("yes"));
	}

}
