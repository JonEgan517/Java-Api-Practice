
public class JavaAPIPractice 
{
	public static void main(String[] args) 
	{
		String phraseOne = "You are cooler,";
		String phraseTwo = " but I am smarter.";
		printFirstThree(phraseOne);
		printMiddleWord(phraseOne);
		printLength(phraseOne);
		firstE(phraseOne);
		lastE(phraseOne);
		addSecondPhrase(phraseOne, phraseTwo);
		replaceEToX(phraseOne, phraseTwo);
		upperCase(phraseTwo);
		getRidOfSpaces(phraseTwo);
		lexicographically(phraseOne, phraseTwo);
	}

		private static void printFirstThree(String letters) 
		{
			System.out.println("Printing the first three characters of You are cooler.");
			letters = letters.substring(0,3);
			System.out.println(letters);
		}

		private static void printMiddleWord(String middle) 
		{
			System.out.println("Printing the middle word of You are cooler.");
			middle = middle.substring(3,7);
			System.out.println(middle);
		}

		private static void printLength(String words) 
		{
			System.out.println("Printing the length of the phrase.");
			int phraseLength = words.length();
			System.out.println(phraseLength);
		}

		private static void firstE(String letterE) 
		{
			System.out.println("Printing the first use of e.");
			System.out.println(letterE.indexOf('e')+1);
		}

		private static void lastE(String letterE) 
		{
			System.out.println("Printing the last use of e.");
			System.out.println(letterE.lastIndexOf('e')+1);
		}

		private static void addSecondPhrase(String first, String second)
		{
			System.out.println(first.concat(second));
		}
		
		private static void replaceEToX(String first, String second) 
		{
			System.out.println(first.replace("e", "x") + second.replace("e", "x"));
		}

		private static void upperCase(String second) 
		{
			System.out.println(second.toUpperCase());
		}

		private static void getRidOfSpaces(String second) 
		{
			System.out.println(second.replace(" ", ""));
		}

		private static void lexicographically(String first, String second) 
		{
			System.out.println(first.compareTo(second));
		}
	
}
