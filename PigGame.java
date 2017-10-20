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
        if(playerScore >= 100) {
            return true;
        }
        else return false;
    }

    public boolean computerWon() {
        if(playerScore >= 100) {
            return true;
        }
        else return false;
    }

   /* public boolean isPlayersTurn() {
        //return true of false
        return playersTurn;
    }
    public GVdie getDie(int num) {
        //return requested die, either 1 or 2
        return d1;
    }*/

    //Mutator methods
    public void rollDice() {
        d1.roll();
        d2.roll();

        if((d1.getValue()== 1) || (d2.getValue() == 1)){
            roundScore = 0;
        }
        else {
            roundScore = roundScore + (d1.getValue() + d2.getValue());
        }
        System.out.println("Dice 1: " + d1.getValue());
        System.out.println("Dice 2: " + d2.getValue());
        System.out.println("Round Score: " + roundScore);

    }
    public void playerRolls() {

    }
    public void playerHolds() {

    }
    public void computerTurn() {

    }
    public void restart() {

    }

    //software testing
    private void playerTurn() {

    }
    public void autoGame(){

    }

}
