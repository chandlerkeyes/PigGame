public class PigGame
{
    private GVdie d1, d2;
    private int playerScore, computerScore, roundScore;
    private boolean playersTurn;
    final int WINNING_SCORE = 100;

    //Contructor
    public PigGame() {
        d1 = new GVdie();
        d2 = new GVdie();
        playerScore = 0;
        computerScore = 0;
        roundScore = 0;
        playersTurn = false;
        System.out.println("Welcome");
    }
    //Accessor Methods
    public int getRoundScore() {
        return roundScore;
    }

    public int getComputerScore() {
        return computerScore;
    }

    public int getPlayerScore() {
        return playerScore;
    }

    public boolean playerWon() {
        if(playerScore >= WINNING_SCORE) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean computerWon() {
        if(computerScore >= WINNING_SCORE) {
            return true;
        }
        else {
            return false;
        }
    }

   /* public boolean isPlayersTurn() {
        //return true or false
        return playersTurn;
    }
    public GVdie getDie(int num) {
        //return requested die, either 1 or 2
        return d1;
    }*/

    //Mutator methods
    private void rollDice() {
        d1.roll();
        d2.roll();

        if((d1.getValue()== 1) || (d2.getValue() == 1)){
            roundScore = 0;
        }
        else {
            roundScore += (d1.getValue() + d2.getValue());
        }
        System.out.println("Dice 1: " + d1.getValue());
        System.out.println("Dice 2: " + d2.getValue());
        System.out.println("Round Score: " + roundScore);

    }

    public void playerRolls() {
        System.out.println("PLAYER TURN");
        while (!playerWon()) {
            rollDice();
            if ((d1.getValue()) == 1 || (d2.getValue() == 1)) {
                roundScore = 0;
                break;
            }
            if ((d1.getValue() == 1) && (d2.getValue() == 1)) {
                playerScore = 0;
            } else {
                playerScore = playerScore + roundScore;
            }
        }
        if (playerWon()) {
            System.out.println("You won!");
        }
        System.out.println("Player's Score: " + playerScore);
    }
    public void playerHolds() {
        playerScore = playerScore + roundScore;
        roundScore = 0;
    }
    public void computerTurn() {
        System.out.println("COMPUTER TURN");
        while (!computerWon()) {
            rollDice();
            if ((d1.getValue()) == 1 || (d2.getValue() == 1)) {
                roundScore = 0;
                break;
            }
            if ((d1.getValue() == 1) && (d2.getValue() == 1)) {
                computerScore = 0;
            }
            else {
                computerScore = computerScore + roundScore;
            }
        }
        if (computerWon()) {
            System.out.println("Computer won!");
        }
        System.out.println("Computer's Score: " + computerScore);
    }
    public void restart() {
        playerScore = 0;
        computerScore = 0;
        roundScore = 0;
        playersTurn = false;
    }

    //software testing
    private void playerTurn() {
        playerRolls();
        playerHolds();
    }
    public void autoGame(){
        restart();
        playerTurn();
        computerTurn();
    }


}
