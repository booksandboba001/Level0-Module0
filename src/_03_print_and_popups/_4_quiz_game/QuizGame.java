package _03_print_and_popups._4_quiz_game;
import java.util.Scanner;
public class QuizGame {
	public static void main(String[] args) {
		int score =0;
		System.out.println("Which Studio Ghibli movie is the 2nd highest grossing movie all-time?");
		Scanner asking = new Scanner(System.in);
		String feedback = asking.nextLine();
		if (feedback.equals("Spirited Away")){
			System.out.println("Correct!");
			score++;
		}
		else {
			System.out.println("Sorry, No.");
			score--;
		}
		System.out.println("How many Studio Ghibli movies are amoung the highest grossing movies?");
		feedback = asking.nextLine();
		if (feedback.equals("Seven")){
			System.out.println("Correct!");
			score++;
		}
		else {
			System.out.println("Sorry, No.");
			score--;
		}
		System.out.println("Which anime is the #1 most grossing anime of all time?");
		feedback = asking.nextLine();
		if (feedback.equals("Demon Slayer: Kimitsu no Yaiba")){
			System.out.println("Correct!");
			score++;
		}
		else {
			System.out.println("Sorry, No.");
			score--;
		}
		System.out.println(score);
		// Create a variable to hold the user's score. Set it equal to zero. 
		
		// ASK A QUESTION AND CHECK THE ANSWER
		
				// 2.  Ask the user a question 
				
				// 3.  Use an if statement to check if their answer is correct
				
				// 4.  if the user's answer was correct, add one to their score 
		
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer
		
		
		// After all the questions have been asked, tell the user their final score 
		
	}
}
