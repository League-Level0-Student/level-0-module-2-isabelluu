//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {

		Random randomMaker = new Random();

		int randomNumber = randomMaker.nextInt(11) + 1;

		System.out.println(randomNumber);

		// 1. Use each value of randomNumber to give the user a random compliment.
		if (randomNumber == 0) {

		} else if (randomNumber == 1) {
			JOptionPane.showMessageDialog(null, "I like your shirt today!");

		} else if (randomNumber == 2) {
			JOptionPane.showMessageDialog(null, "I Like your face");

		} else if (randomNumber == 3) {
			JOptionPane.showMessageDialog(null, "I like your hair");
		} else if (randomNumber == 4) {
			JOptionPane.showMessageDialog(null, "I like your nose");

		}

		else if (randomNumber == 5) {
			JOptionPane.showMessageDialog(null, "I like your house");

		}

		else if (randomNumber == 6) {
			JOptionPane.showMessageDialog(null, "I like your shoes");

		} else if (randomNumber == 7) {
			JOptionPane.showMessageDialog(null, "I like your pants");

		} else if (randomNumber == 8) {
			JOptionPane.showMessageDialog(null, "I like your hat");

		} else if (randomNumber == 9) {
			JOptionPane.showMessageDialog(null, "I like your hands");

		} else if (randomNumber == 10) {
			JOptionPane.showMessageDialog(null, "I like your nails");

		}
		// 2. Repeat all the code above 10 times

		// 3. Find someone to test out your program. They will like it :)
	}
}
