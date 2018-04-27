
//Alli Farr, Mike DeCoopman, Anthony Reakoff   4-27-18 Week One Capstone

import java.util.Scanner;

public class WeekOneCapstone {

	public static void main(String[] args) {

		String userWord;
		String lowercaseWord;
		char x;
		String pigLatin;
		String cont = " ";

		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to the Pig Latin Translator!");

		do {

			System.out.println("Please enter one word: ");
			userWord = scan.nextLine();

			lowercaseWord = userWord.toLowerCase();

			x = lowercaseWord.charAt(0);

			if (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u') {
				pigLatin = lowercaseWord + "way";
				System.out.println(pigLatin);

			} else {
				int firstVowelIndex = firstVowel(lowercaseWord);
				String first = lowercaseWord.substring(0, firstVowelIndex);
				String last = lowercaseWord.substring(firstVowelIndex, lowercaseWord.length());
				System.out.println(last + first + "ay");

			}
			System.out.println("Translate another line? (y/n)");
			cont = scan.nextLine();
		} while (cont.equalsIgnoreCase("y"));

		System.out.println("Goodbye");
	}

	public static int firstVowel(String words) {
		for (int i = 0; i < words.length(); i++) {
			if (words.charAt(i) == 'a' || words.charAt(i) == 'e' || words.charAt(i) == 'i' || words.charAt(i) == 'o'
					|| words.charAt(i) == 'u') {

				return i;
			}

		}
		return -1;

	}

}
