//Vaishnavi Shankar Shinde
//Java programming
//Task-2:Number Guessing Game

package Number_Game;

import java.io.*;
import java.util.*;
public class number_game{
	
public static void Number_game()
{
	Scanner s1 = new Scanner(System.in);
	System.out.print("Enter the upper limit for the guess number-Range :");
	int n=s1.nextInt();
	int num=1+(int)(n*Math.random());
	int guess;
	int trials=5,Score=0;
	int i,Playagain;
		
	System.out.println("Welcome To Number Guessing Game !!!!!");
		
	for(i=0;i<5;i++) 
	{
		System.out.print("\nEnter Your Guess : ");
		guess=s1.nextInt();
		//If the Number is guessed....
			if(guess==num) 
			{
				System.out.println("Congrats!! Your Number is correct!!!!!");
				Score+=10;
				System.out.println("Your score is "+Score);
			}

			else if(guess>n || guess<0) {
				System.out.println("Sorry!! Your Number is Between 0 to "+n);
			}
			
			else if (guess>num && i!=trials-1) {
				System.out.println("Sorry!! The Number is less than"+guess+"!!!!!");
			}
			
			else if(guess<num && i!=trials-1) {
				System.out.println("Sorry!! The Number is greater than"+guess+"!!!!!");
			}
		}
		
		if(trials==i) 
		{
			System.out.println("\nyou have completed trials");
			System.out.println("\nThe number was "+num);
			System.out.println("\nWant to play again?");
			System.out.println("\n\nEnter 1 for Next Round..");
			Playagain=s1.nextInt();
			
			if(Playagain==1)
			{
				Number_game();   //this will call function again
			}
			else 
			{
				System.out.println("Thanks for playing!!!!!");
			}
		}
	}
	public static void main(String[] args) 
	{
		Number_game();         //Function call
	}
}