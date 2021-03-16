/*
This is a subclass of the randomizer class. It can generate a random value for the computer output.
*/
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
