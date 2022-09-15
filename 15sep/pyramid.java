/*
program: 	Java program to print Trainagle pattern
Author: Tanushka gupta
Date: 15/09/2022
*/
import static java.lang.System.*;
import java.util.Scanner;  
class Pyramid 
{    
public static void main(String args[])   
{    
//i for rows and j for columns      
//row denotes the number of rows you want to print  
int i, j, row;
out.print("Enter the number of rows you want to print: ");   
Scanner sc = new Scanner(System.in);  
row = sc.nextInt();        
//Outer loop work for rows  
for (i=0; i<row; i++)   
{  
//inner loop work for space      
for (j=row-i; j>1; j--)   
{  
//prints space between two stars  
out.print(" ");   
}   
//inner loop for columns  
for (j=0; j<=i; j++ )   
{   
//prints star      
out.print("* ");   
}   
//throws the cursor in a new line after printing each line  
out.println();   
}   
}   
}  