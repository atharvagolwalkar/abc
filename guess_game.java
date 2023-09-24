import java.util.*;
public class guess_game
{


	public static void main(String[] args)
	{
	int answer,guess;
	final int MAX = 100;

	Scanner var =new Scanner(System.in);
	System.out.println("Enter number between 1 to 100: ");
	guess = var.nextInt();
	
	game obj = new game();
	int i = obj.isCorrectNumber(guess);
	while(i != 0)
		{
		guess=var.nextInt();	
		i = obj.isCorrectNumber(guess);
		}
	 System.out.println("\n***Congratulations,you guessed it correct!!***");
	 System.out.println("\nNo of Guesses: " + (obj.getNoOfGuesses()));
	}
}
class game
{
static int noOfGuesses=0;
int answer,guess;
final int MAX = 100;
public game()  {
	Random rand = new Random();
	answer = rand.nextInt(MAX) + 1;
	}

public int isCorrectNumber(int guess)
{
noOfGuesses++;

if (guess == answer)
	return 0;
else if(guess > answer)
	{
	
	System.out.print("\nThe entered number is greater than the random number generated.");
	return 1;
	}
else
	{
	
	System.out.print("\nThe entered number is less 	than the random number generated.");
	return -1;
 	}
}
public int getNoOfGuesses()
{
return noOfGuesses;
}
}