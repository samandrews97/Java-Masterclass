public class Main {

    public static void main(String[] args) {

        int highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Tim", highScorePosition);

        highScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition("Alice", highScorePosition);

        highScorePosition = calculateHighScorePosition(100);
        displayHighScorePosition("Bob", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Charlie", highScorePosition);

    }

    public static int calculateHighScorePosition(int playerScore) {

        int highScorePosition = 4;

        if (playerScore >= 1000) {
            highScorePosition = 1;
        } else if (playerScore >= 500) {
            highScorePosition = 2;
        } else if (playerScore >= 100) {
            highScorePosition = 3;
        }

        return highScorePosition;

    }

    public static void displayHighScorePosition(String playerName, int highScorePosition) {

        System.out.println(playerName + " managed to get into position " + highScorePosition + " on the high score list");

    }

}
