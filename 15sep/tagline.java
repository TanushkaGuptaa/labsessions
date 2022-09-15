/*
program: Write a java program to print the tagline of any 5 companies (Enahnced switch case)..
@Author:Tanushka Gupta
@Date: 15/09/2002
*/
import java.util.Scanner;
class Brand
{
	//creating static method
	static void Tagline()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter brand name : ");
		String brand=sc.next().toLowerCase();	
		
		switch(brand)    //(Tagline); //using switch case
		{
			//using different cases in switch case
			case "Hp":
				System.out.println("They should make the world a better place.");	
			break;
			case "Apple": 
				System.out.println("Think different");
			break;
			case "Lenovo":
				System.out.println("Innovation Never Stands Still");
			break;
			case "Dell": 
				System.out.println("Innovation that stops at nothing");
			break;
			case "Microsoft":
			System.out.println("We believe in what people make possible.");
			break;
			//default value if conditions are not true
		default: System.out.println("only valid for - Hp,Apple,Lenovo,Dell and Microsoft");
		}
	}
	//calling main mehtod
public static void main(String args[])
{
	//for input of brand name and then printing it's tagline
	//System.output.println("the tagline of:"  +args[0] +"is" +Tagline()); 
	Tagline(); //calling static mehtod
}
}