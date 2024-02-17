package week06;

public class App {
    public static void main(String[] args) {
        // Instantiate a Deck and two Players, call the shuffle method on the deck.
        Deck deck = new Deck();
        Player player1 = new Player("Player 1");
        Player player2 = new Player("Player 2");
        
        // Using a traditional for loop, iterate 52 times calling the Draw method on the other player each iteration using the Deck you instantiated.
        for (int i = 0; i < 52; i++) {
            player1.draw(deck);
            player2.draw(deck);
        }
        
        // Using a traditional for loop, iterate 26 times and call the flip method for each player.
        for (int i = 0; i < 26; i++) {
            Card card1 = player1.flip();
            Card card2 = player2.flip();
            
            // Print out information about the flipped cards
            System.out.println("Player 1 flips: ");
            card1.describe();
            System.out.println("Player 2 flips: ");
            card2.describe();
            
            // Compare the value of each card returned by the two player’s flip methods.
            if (card1.getValue() > card2.getValue()) {
                player1.incrementScore();
                System.out.println("Player 1 received a point.");
            } else if (card1.getValue() < card2.getValue()) {
                player2.incrementScore();
                System.out.println("Player 2 received a point.");
            } else {
                System.out.println("No point was awarded. It's a tie.");
            }
            
            // Print the updated score after each turn
            System.out.println("Current score - Player 1: " + player1.getScore() + ", Player 2: " + player2.getScore());
        }
        
        // After the loop, compare the final score from each player.
        int score1 = player1.getScore();
        int score2 = player2.getScore();
        
        // Print the final score of each player and either “Player 1”, “Player 2”, or “Draw” depending on which score is higher or if they are both the same.
        System.out.println("Final score:");
        System.out.println("Player 1: " + score1);
        System.out.println("Player 2: " + score2);
        
        if (score1 > score2) {
            System.out.println("Player 1 wins!");
        } else if (score1 < score2) {
            System.out.println("Player 2 wins!");
        } else {
            System.out.println("It's a draw!");
        }
    }
}
