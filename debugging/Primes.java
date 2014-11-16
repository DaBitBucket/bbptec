/**
 * This program is supposed to calculate all of the prime numbers up to the provided
 * number. A prime number is one which has no factors: 3, 5, 7, 11, 13 etc.
 * This is accomplished in a simple way:
 *    Loop through all numbers up to the given number
 *    For each number, loop through all the numbers up to the square root of it
 *        If the modulus (remainder of division) is zero, it is a factor
 *    Ignore any numbers that have a factor, and print the rest
 * The program may not compile right off the bat, and most certainly doesn't work.
 * Your job is to fix it.
 **/

public class Prime {

	public static void main(String args[]) {
		Scanner kbIn = new Scanner(System.in);
		int bound;

		System.out.print("Enter a number to count primes to: ")

		try {
			bound = Integer.parseInt(kbIn.nextLine());
		} catch (NumberFormatException e) {
			System.out.println("That's not a number! I'm leaving.");
		} finally {
			System.out.println("you shouldn't be seeing this...");
		}

		for(int i = 2; i < bound; i++)
			isPrime = true;

			for(int j = 2; j < Math.sqrt((double)i); j++) {
				if(j % i == 0) {
					isPrime = false;
					break;
				}
			}

			if(isPrime) {
				System.out.println(j);
			}
		}			
	}
}
