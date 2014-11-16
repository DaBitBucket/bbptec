/**
 * This program is supposed to request a word from the user and determine if it
 * is a palindrome (read same forwards as backwards).
 * The program may not compile right off the bat, and most certainly doesn't work.
 * Your job is to fix it.
 **/

import java.util.Scanner;

public class Palindrome {

	boolean isPalindrome = true;

	public static void main(String args[]) {
		Scanner kbIn = new Scanner(System.out);
		String input = "";

		System.out.print("Type a word and hit enter: ");
		input = kbIn.nextLine();

		for(int i = 1; i <= input.length()/2; i++) {
			if(input.charAt(i) != input.charAt(input.length() - i)) {
				isPalindrome = true;
				break;

		}

		System.out.println(input + " is " + (isPalindrome ? "a" : "not a") + " palindrome!");
	}

}
