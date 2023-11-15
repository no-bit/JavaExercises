public class methodChallenge {
    public static void main(String[] args) {
        displayHighScorePosition("tim", calculateHighScorePosition(1500));
    }
    public static void displayHighScorePosition(String playerName, int playerPosition){
        System.out.println(playerName + " managed to get into position " + playerPosition + " on the high score list");
    }
    public static int calculateHighScorePosition(int playerScore) {
        if (playerScore >= 1000){
            return 1;
        } else if (playerScore >= 500) {
            return 2;
        } else if (playerScore >= 100){
            return 3;
        } else {
            return 4;
        }
    }
}