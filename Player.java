package week06;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private List<Card> hand;
    private int score;

    public Player(String name) {
        this.name = name;
        this.hand = new ArrayList<>();
        this.score = 0;
    }

    // Describe method
    public void describe() {
        System.out.println("Player: " + name);
        System.out.println("Score: " + score);
        System.out.println("Hand:");
        for (Card card : hand) {
            card.describe();
        }
    }

    // Flip method
    public Card flip() {
        if (!hand.isEmpty()) {
            return hand.remove(0);
        } else {
            return null; // no more cards in hand
        }
    }

    // Draw method
    public void draw(Deck deck) {
        Card card = deck.draw();
        if (card != null) {
            hand.add(card);
        }
    }

    // Increment score method
    public void incrementScore() {
        score++;
    }

    // Getter for score
    public int getScore() {
        return score;
    }
}
