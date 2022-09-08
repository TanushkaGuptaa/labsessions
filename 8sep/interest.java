/*Program: find the simple interest
 Date:8 sep 2022
 @Author: Tanushka Gupta
*/
import java.util.Scanner;
class Interest 
{
    public static void Rate() 
    {
        //Take input from the user
        //Create an instance of Scanner class
        Scanner sc = new Scanner(System.in);
        //Declare variables
        float p, r, t, si;
        System.out.println("Enter the Principal : ");
        p = sc.nextFloat();     //Initialize the variables
        System.out.println("Enter the Rate of interest : ");
        r = sc.nextFloat();     //Initialize the variables
        System.out.println("Enter the Time period : ");
        t = sc.nextFloat();     //Initialize the variables
        sc.close();
        //Calculate the simple interest
        si = (p * r * t) / 100;
        //Print the simple interest
        System.out.println("Simple Interest is: " +si);
    }
	public static void main(String args[]) {
		Rate();
	}
}