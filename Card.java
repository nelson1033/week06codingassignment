package week06;

public class Card {
    private int value;
    private String name;
    private String suit;

    public Card(int rank, String suit) {
        this.value = rank;
        this.setSuit(suit);
        this.name = getValueName() + " of " + suit;
    }

    // Getter and setter for value
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Describe method
    public void describe() {
        System.out.println(name);
    }

    // Helper method to get name based on value
    private String getValueName() {
        switch (value) {
            case 11:
                return "Jack";
            case 12:
                return "Queen";
            case 13:
                return "King";
            case 14:
                return "Ace";
            default:
                return String.valueOf(value);
        }
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }
}
