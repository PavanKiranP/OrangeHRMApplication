package StringComparision;

public class StringCompare {

	public static void main(String[] args) {
		
		String string1="LiveTech";
		System.out.println("The character/alphabet at the Index of the string is:- "+string1.charAt(4));
		
		char characterAtIndex=string1.charAt(0);
		System.out.println("The character/alphabet at the Index of the string is:- "+characterAtIndex);
		
		int characterAtAnIndex7=string1.charAt(7);
		System.out.println("The character/alphabet at the Index of the string related ASCII value is:- "+characterAtAnIndex7);
		
		
		System.out.println("########## String Values Covertion To Upper Case & Lower Case ##########");
		
		String string2="SELENIUM";
		String convertedStringValueToLowerCase=string2.toLowerCase();
		
		System.out.println("The string after converting to LowerCase is :- "+convertedStringValueToLowerCase);
		
		String string3="LoadRunner";
		String convertedStringValueToUpperCase=string3.toUpperCase();
		System.out.println("The string after converting to UpperCase is :- "+convertedStringValueToUpperCase);
		
		System.out.println("@@@@@@@@@@ strings comparisions @@@@@@@@@@");
		
		String string4="TestingTools";
		String string5="TestingTools";
		
		if(string4.equals(string5))     //Checks for the next match of the letter of the strings
		{
			System.out.println("Boths the string variables string4 and string5 are Equal");
		}
		
		else
		{
			System.out.println("Boths the string variables string4 and string5 are NOT Equal");
		}
		
		String string6="WebDriver";
		String string7="webdriver";
		
		if(string6.equals(string7))
		{
			System.out.println("Boths the string variables string6 and string7 are Equal");
		}
		
		else
		{
			System.out.println("Boths the string variables string6 and string7 are NOT Equal");

		}
		
		System.out.println("=== Strings should be Equal but Lowercase and Uppercase letter"+"Should be Ignored ===");
		
		if(string6.equalsIgnoreCase(string7))
		{
			System.out.println("Boths the string variables string6 and string7 are Equal");
		}
		
		else
		{
			System.out.println("Boths the string variables string6 and string7 are NOT Equal");
		}
		System.out.println("$$$$$$$$$$ Checking for Existance of String Terxt $$$$$$$$$$");
		
		String string8="LiveTech";
		String string9="Tech";
		
		if(string8.contains(string9))
		{
			System.out.println("Expected Value of string9 Found in string8");
		}
		
		else
		{
			System.out.println("Expected Value of string9 NOT Found in string8");
		}
		
		System.out.println("^^^^^^^^^^ Compare Strings Ignore Case ^^^^^^^^^^");
		
		String string10="SELENIUM";
		String string11="selenium";
		
		if(string10.equalsIgnoreCase(string11))
		{
			System.out.println("Both Strings are Same");
		}
		
		else
		{
			System.out.println("Both Strings are NOT Same");
		}

	}

}
