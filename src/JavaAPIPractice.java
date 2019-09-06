
public class JavaAPIPractice 
{
	public static void main(String[] args) 
	{
		String phrase = "You are cooler";
		printFirstThree(phrase);
		printMiddleWord(phrase);
		printLength(phrase);
		firstE(phrase);
		lastE(phrase);
		//addSecondPhrase();
		//replaceEToX();
		//upperCase();
		//getRidOfSpaces();
		//lexicographically();
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

		private static void addSecondPhrase()
		{
			
		}
		
		private static void replaceEToX() 
		{
		
		}

		private static void upperCase() 
		{
		
		}

		private static void getRidOfSpaces() 
		{
		
		}

		private static void lexicographically() 
		{
		
		}
	
}
