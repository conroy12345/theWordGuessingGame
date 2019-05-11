package org.reader.app;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


class GuessingWordGameTest {

	GuessingWordGame guessingWordGame = new GuessingWordGame();

	
	@Test
	void test() {
		String expected = "SECRET WORD";
		
		assertEquals(expected,guessingWordGame.search());
	}

}
