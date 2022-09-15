/*
program:Java progam to find whether the character entered is vowel ,consonant ,number and special character.
Author: Tanushka gupta
Date: 15/09/2022
*/

//import all methods from system class
import static java.lang.System.*;

// Creating a class named SwitchDemo
class vowelConsonent
{	
	// Creating checkch method
	static void checkch(String str){
		// storing the ch in a variable
		char ch=str.charAt(0);
		
		// if ch is uppercase
		if((ch>=65)&&(ch<=90)){
			out.print("It is a capital(uppercase) letter.");
			// if ch is vowel
			if((ch=='A')||(ch=='E')||(ch=='I')||(ch=='O')||(ch=='U')){
				out.println("It is a vowel.");
			}
			// if ch is consonant
			else{
				out.println("It is a consonant.");
			}
		}
		// if ch is lowercase 
		else if((ch>=97)&&(ch<=122)){
			out.print("It is a small(lowercase) letter.");
			// if ch is vowel
			if((ch=='a')||(ch=='e')||(ch=='i')||(ch=='o')||(ch=='u')){
				out.println("It is a vowel.");
			}
			// if ch is consonant
			else{
				out.println("It is a consonant.");
			}

		}
		// if ch is number
		else if((ch>=48)&&(ch<=57)){
			out.print("It is a number.");
		}
		// if ch is special charcter
		else{
			out.print("It is a special charcter.");
		}
	}
	
		
	//Calling main method
	public static void main(String...args){
	
		// Calling checkch method
		checkch(args[0]);
	}
}