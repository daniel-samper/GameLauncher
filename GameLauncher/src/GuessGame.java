/*
 * The GuessGame obect's startGame() method is where
 * the entire game plays out. It creates 3 players, then "thinks"
 * of a random number (the target for the players to guess). It then
 * asks each player to guess, checks the result, and either prints 
 * out information about the winning player(s) or asks them to guess again.
 */
public class GuessGame {

	Player p1; //GuessGame has 3 instance variables for
	Player p2; // the three Player objects
	Player p3;
	
	public void startGame() {
		p1 = new Player(); //create 3 Player objects and
		p2 = new Player(); //assign them to three Player
		p3 = new Player(); //instance variables
		
		int guessp1 = 0; //declare 3 variables to hold the
		int guessp2 = 0; //three guesses the Player make
		int guessp3 = 0;
		
		boolean p1isRight = false; //declare 3 variables to hold a true or
		boolean p2isRight = false; //false based on the player's answer
		boolean p3isRight = false;
		
		//make a 'target' number that the players have to guess
		int targetNumber = (int) (Math.random() * 10);
		System.out.println("I'm thinking of a number bretween 0 and 9...");
		
		while(true) {
			System.out.println("Number to guess is "+ targetNumber);
			
			p1.guess(); //call each player's guess() method
			p2.guess();
			p3.guess();
			
			//get each player's guess (the result of their
			//guess() method running) by accessing the number
			//variable of each player
			guessp1 = p1.number;
			System.out.println("Player one guessed " + guessp1);
			
			guessp2 = p2.number;
			System.out.println("Player two guessed " + guessp2);
			
			guessp3 = p3.number;
			System.out.println("Player three guessed " + guessp3);
			
			//check each player's guess to see if it matches
			//the target number. If a player is right, then
			//set that player's variable to be true
			//(remember, we set it false by default)
			
			if (guessp1 == targetNumber) {
				p1isRight = true;
			}
			if (guessp2 == targetNumber) {
				p2isRight = true;
			}
			if (guessp3 == targetNumber) {
				p3isRight = true;
			}
			
			if (p1isRight || p2isRight || p3isRight) { //if player one OR player tow OR player three is right
				System.out.println("We have a winner!"); 
				System.out.println("Player one got it right? " + p1isRight);
				System.out.println("Player two got it right? " + p2isRight);
				System.out.println("Player three got it right? " + p3isRight);
				System.out.println("Game is over");
				break; //game over so break out the loop
			} else {
				//otherwise, stay in the loop and ask the players for another guess
				System.out.println("players will have to try again");
			}
			
		}
		
		
		
		
	}
	
}
