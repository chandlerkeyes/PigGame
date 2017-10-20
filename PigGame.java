public class PigGame
{
    private GVdie d1, d2;
    private int playerScore, computerScore, roundScore;
//    private boolean playersTurn;
    final int WINNING_SCORE = 100;

    //Contructor
    public PigGame() {
        //FIXME: STEP 3 Contructor
        d1 = new GVdie();
        d2 = new GVdie();
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
    //FIXME: come back to this
    public boolean playerWon() {
        return false;
    }
    //FIXME: come back to this
    public boolean computerWon() {
        return false;
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
