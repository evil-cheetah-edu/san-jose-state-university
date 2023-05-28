package edu.sjsu.assignment1;

public class Card
{
    private String card_shorthand;

    public Card(String shorthand)
    {
        this.card_shorthand = shorthand;
    }

    public String getDescription()
    {
        switch ( this.card_shorthand )
        {
            /// Twos
            case "2H": return "Two of Hearts";
            case "2C": return "Two of Clubs";
            case "2D": return "Two of Diamonds";
            case "2S": return "Two of Spades";

            /// Threes
            case "3H": return "Three of Hearts";
            case "3C": return "Three of Clubs";
            case "3D": return "Three of Diamonds";
            case "3S": return "Three of Spades";

            /// Fours
            case "4H": return "Four of Hearts";
            case "4C": return "Four of Clubs";
            case "4D": return "Four of Diamonds";
            case "4S": return "Four of Spades";

            /// Fives
            case "5H": return "Five of Hearts";
            case "5C": return "Five of Clubs";
            case "5D": return "Five of Diamonds";
            case "5S": return "Five of Spades";

            /// Sixes
            case "6H": return "Six of Hearts";
            case "6C": return "Six of Clubs";
            case "6D": return "Six of Diamonds";
            case "6S": return "Six of Spades";

            /// Sevens
            case "7H": return "Seven of Hearts";
            case "7C": return "Seven of Clubs";
            case "7D": return "Seven of Diamonds";
            case "7S": return "Seven of Spades";
            /// Eights
            case "8H": return "Eight of Hearts";
            case "8C": return "Eight of Clubs";
            case "8D": return "Eight of Diamonds";
            case "8S": return "Eight of Spades";

            /// Nines
            case "9H": return "Nine of Hearts";
            case "9C": return "Nine of Clubs";
            case "9D": return "Nine of Diamonds";
            case "9S": return "Nine of Spades";

            /// Tens
            case "10H": return "Ten of Hearts";
            case "10C": return "Ten of Clubs";
            case "10D": return "Ten of Diamonds";
            case "10S": return "Ten of Spades";

            /// Jacks
            case "JH": return "Jack of Hearts";
            case "JC": return "Jack of Clubs";
            case "JD": return "Jack of Diamonds";
            case "JS": return "Jack of Spades";

            /// Queens
            case "QH": return "Queen of Hearts";
            case "QC": return "Queen of Clubs";
            case "QD": return "Queen of Diamonds";
            case "QS": return "Queen of Spades";

            /// Kings
            case "KH": return "King of Hearts";
            case "KC": return "King of Clubs";
            case "KD": return "King of Diamonds";
            case "KS": return "King of Spades";

            /// Aces
            case "AH": return "Ace of Hearts";
            case "AC": return "Ace of Clubs";
            case "AD": return "Ace of Diamonds";
            case "AS": return "Ace of Spades";

            default: return "Unknown";
        }
    }
}
