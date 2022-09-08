/*
  program:Java program to find Quotient and Remainder(take input)
  @author: Tanushka gupta
  Date:8 sep 2022
 */
 import java.util.Scanner;
 class RemenderQuo {
     static void Remender()
	 {
        
        int dividend, divisor, quo, rem;
        Scanner in = new Scanner(System.in);
        
        //get the dividend value
        System.out.print("Enter Dividend:");
        dividend = in.nextInt();
        
        //get the divisor value 
        System.out.print("Enter Divisor:");
        divisor = in.nextInt();
        
        //find quotient 
        quo = dividend / divisor;
        
        //find reminder
        rem = dividend % divisor;
        
        //print the result
        System.out.println("Quotient: "+quo);
        System.out.println("Remainder: "+rem);
    }
	//calling main method
	public static void main(String...args){
		Remender();
	}
}
