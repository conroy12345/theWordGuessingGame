package org.reader.app;

public class GuessingWordGame {

	public static void main(String[] args) {
		GuessingWordGame guessingWordGame = new GuessingWordGame();
		guessingWordGame.search();
		
	}
	
	public String search() {
		int numberOfPlayers = 0;

		// while the word search is not equal to secret word it will iterate for 9 times

		while (!Constants.GUESSES.equalsIgnoreCase(Constants.SECRET_TORD) && (Constants.NUMBER_OG_SEARCHES < 9)) {
			Constants.NUMBER_OG_SEARCHES++;
			System.out.println("Enter a guess !");
			Constants.GUESSES = Constants.SCANNER_INPUT.nextLine();
			if (Constants.NUMBER_OG_SEARCHES == 9) {
				System.exit(0);
			}
			while (numberOfPlayers < 4) {
				numberOfPlayers++;

				if (numberOfPlayers == 4) {
					numberOfPlayers = 0;
				}
				if (Constants.GUESSES.contentEquals(Constants.SECRET_TORD)) {
					System.out.println(
							"Player : number " + numberOfPlayers + ": is Correct! " + Constants.GUESSES + " it right");
					break;
				} else
					System.out.println("Player : #" + numberOfPlayers + ": icorrect please try again!");
				break;

			}

		}
		System.out.println("You are correct!");
		return Constants.GUESSES;
	}
}
