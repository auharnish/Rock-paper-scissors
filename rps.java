import java.util.*;

public class Randomizer{

	public static Random theInstance = null;
	
	public Randomizer(){
		
	}
	
	public static Random getInstance(){
		if(theInstance == null){
			theInstance = new Random();
		}
		return theInstance;
	}
	
	public static boolean nextBoolean(){
		return Randomizer.getInstance().nextBoolean();
	}

	public static boolean nextBoolean(double probability){
		return Randomizer.nextDouble() < probability;
	}
	
	public static int nextInt(){
		return Randomizer.getInstance().nextInt();
	}

	public static int nextInt(int n){
		return Randomizer.getInstance().nextInt(n);
	}

	/* Return a nubmer between min and max, inclusive. */
	public static int nextInt(int min, int max){
		return min + Randomizer.nextInt(max - min + 1);
	}

	public static double nextDouble(){
		return Randomizer.getInstance().nextDouble();
	}

	public static double nextDouble(double min, double max){
		return min + (max - min) * Randomizer.nextDouble();
	}
    
}

public class RockPaperScissors extends ConsoleProgram
{
    private static final String USER_PLAYER = "User wins!";
    private static final String COMPUTER_PLAYER = "Computer wins!";
    private static final String TIE = "Tie";
    public String getWinner(String user, String computer)
        {
            
        // Return the proper string for the result.
        String myMove = user;
        String opponentMove = computer;
    
        // if condition to determine output
        
            if(myMove.equals(opponentMove)){
    			return TIE;
    		} 
    		else if((myMove.equals("rock") && opponentMove.equals("scissors")) || (myMove.equals("scissors") && opponentMove.equals("paper")) || (myMove.equals("paper") && opponentMove.equals("rock"))) {
    			return USER_PLAYER;
    		}
    		else if(myMove.equals("")){
    		    return "Thank you for playing!";
    		}
    		else {
    			return COMPUTER_PLAYER;
    		}
        
    }
            
  
    public void run()
    {
        String userInput = "";
        do{
            Randomizer t = new Randomizer();
            userInput = readLine("Enter your choice (rock, paper, or scissors):");
            String computerInput = "";
            int x = t.nextInt(1, 3);
            if(x == 1){
                computerInput = "rock";
            }
            else if(x == 2){
                computerInput = "paper";
            }
            else if(x == 3){
                computerInput = "scissors";
            }
            System.out.println("User: " + userInput);
            System.out.println("Computer: " + computerInput);
            System.out.println(getWinner(userInput, computerInput));
        }while(!userInput.equals(""));
    }
}
