package edu.sjsu.groupassignment;


public class Card
{
    private String rank;
    private String suite;

    public Card(String shorthand)
    {
        switch ( shorthand.substring(0, shorthand.length() - 1))
        {
            case "2":
                rank = "Two";
                break;

            case "3":
                rank = "Three";
                break;

            case "4":
                rank = "Four";
                break;

            case "5":
                rank = "Five";
                break;

            case "6":
                rank = "Six";
                break;

            case "7":
                rank = "Seven";
                break;

            case "8":
                rank = "Eight";
                break;

            case "9":
                rank = "Nine";
                break;

            case "10":
                rank = "Ten";
                break;

            case "J":
                rank = "Jack";
                break;

            case "Q":
                rank = "Queen";
                break;

            case "K":
                rank = "King";
                break;

            case "A":
                rank = "Ace";
                break;

            default:
                rank  = "Unknown";
                suite = "Unknown";
        }

        switch ( shorthand.substring( shorthand.length() - 1 ) )
        {
            case "H":
                suite = "Hearts";
                break;

            case "C":
                suite = "Clubs";
                break;

            case "D":
                suite = "Diamonds";
                break;

            case "S":
                suite = "Spades";
                break;

            default:
                rank  = "Unknown";
                suite = "Unknown";
        }
    }

    public String getDescription()
    {
        if ( rank.equals("Unknown") )
            return "Unknown";

        return rank + " of " + suite;
    }
}
