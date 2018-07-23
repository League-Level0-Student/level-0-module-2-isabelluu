//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package random;

import java.util.Random;

public class IntroToRandom {
	public static void main(String[] args) {

		int r = 0;

		// 3. Now make r random.
		Random randy1 = new Random();
		// Create an object of the Random class
		// use .nextInt() to get a random number
		int r1 = randy1.nextInt();

		// 4. Limit the random number between 0 and 100
		int r2 = randy1.nextInt(101);
		// 5. Limit the random number between 25 and 75. Hint: ((highest value - lowest
		// value)+1) + lowest value
		int r3 = randy1.nextInt(51) + 25;
		// 6. Challenge: Limit the random number between -222 and 88
		int r4 = randy1.nextInt(300) - 222;
		// 1. Print out the value of r
		System.out.println(r + r1 + r2 + r3 + r4);
		// 2. Run the program. What number appears in the console?
		// Run it again. Is the number the same?
	}
}