import java.security.SecureRandom;//must import first before using a secure random
import java.util.Scanner;

public class MethodsAndArrays {//this is your driver class

	public static void main(String[] args) {
		/*long myLongVariable = 100000L;//L - tells that the number is a Long -Long is primitive data type - 64 bit - Long ass integer
		int myIntVariable;
		//Cast Long to Int
		myIntVariable = (int)myLongVariable;//cast operator for int - now the Long is an Int
		
		System.out.println(myIntVariable);//Display to Check*/
		
		//One Way to Hard Code it without Using a Method
		/*
		SecureRandom generateRandom = new SecureRandom();
		int die1 = 0;		
		int die2 = 0;
		int dice =  0;
		
		die1 = generateRandom.nextInt(6) + 1; //num between 1-6
		die2 = generateRandom.nextInt(6) + 1;
		dice = die1 + die2;// sum of both rand-numbs (2 - 12)*/
		int dice, sides;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of dies you want to roll and how many sides of the dice you are using?");
		System.out.print("Number of dies: ");
		dice = input.nextInt();
		System.out.print("Number of sides: ");
		sides = input.nextInt();
		
		System.out.println("Sum of dies are: " + rollDice(dice,sides));
	}
	//RollDice method - arguments take number of dies, and what their supposed sides are
	public static int rollDice(int numDice, int numSides) 
	{
		SecureRandom generateRandom = new SecureRandom();
		
		int result = 0;// can't decided access modifiers for variables in static methods --> can't do private variable
		//Making an Array of Integers to generate random die results
		
		/*//new int array (dice) with the size of (numDice = 3 dies)
		 * int [] dice = new int [numDice]; 
		 * Depending on the number of dies to increase the number of items in the array,
		 * each item would then have a random number - but for now it is counter-intuitive.
		*/
		for(int index = 0; index < numDice;index++) //for-loop cycles through the number of dies (2 dies, 2 random numbers to assign)
		{
			result += generateRandom.nextInt(numSides) + 1;//result increments with each random number being cycles via the for-loop - making the 
		}
		return result;
	}

}
