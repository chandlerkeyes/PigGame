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
        playersTurn = true;
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

    public boolean isPlayerTurn() {
        //return true or false
        return playersTurn;
    }
    public GVdie getDie(int num) {
        //return requested die, either 1 or 2
        if (num == 1) {
            return d1;
        }
        else if (num == 2) {
            return d2;
        }
        else {
            return null;
        }
    }
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
        if ((d1.getValue() == 1) && (d2.getValue() == 1)) {
            playerScore = 0;
            roundScore = 0;
        }
        System.out.println("Dice 1: " + d1.getValue());
        System.out.println("Dice 2: " + d2.getValue());
        System.out.println("Round Score: " + roundScore);

    }

    public void playerRolls() {
        System.out.println("PLAYER TURN");
            playersTurn = true;
            rollDice();
            if ((d1.getValue()) == 1 || (d2.getValue() == 1)) {
                roundScore = 0;
                playersTurn = false;
            }
            if ((d1.getValue() == 1) && (d2.getValue() == 1)) {
                playerScore = 0;
                playersTurn = false;
            } else {
                playerScore = playerScore + roundScore;
            }
        if (playerWon()) {
            System.out.println("You won!");
        }
        System.out.println("Player's Score: " + playerScore);
    }
    public void playerHolds() {
        playerScore = playerScore + roundScore;
        roundScore = 0;
        computerTurn();
    }
    public void computerTurn() {
            System.out.println("COMPUTER TURN");
            playersTurn = false;
                rollDice();
                if ((d1.getValue()) == 1 || (d2.getValue() == 1)) {
                    roundScore = 0;
                    playersTurn = true;
                }
                if ((d1.getValue() == 1) && (d2.getValue() == 1)) {
                    computerScore = 0;
                    playersTurn = true;
                } else {
                    computerScore = computerScore + roundScore;
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
        playersTurn = true;
    }

    //software testing
    private void playerTurn() {
        playersTurn = true;
        playerRolls();
        playerHolds();
    }
    public void autoGame(){
        restart();
        while (!playerWon() && ! computerWon()) {
            playerTurn();
            computerTurn();
        }
    }
}
