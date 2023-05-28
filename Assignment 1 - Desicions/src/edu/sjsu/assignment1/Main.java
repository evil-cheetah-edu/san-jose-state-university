package edu.sjsu.assignment1;

public class Main
{
    public static void main(String[] args)
    {
        /// Testing for MyTime
        MyTime.printTimeDifference("0120", "1510");
        MyTime.printTimeDifference("1635", "0250");

        /// Testing for Card
        Card card1 = new Card("10S");
        System.out.println( card1.getDescription() );

        Card card2 = new Card("QC");
        System.out.println( card2.getDescription() );

        Card card3 = new Card("11H");
        System.out.println( card3.getDescription() );
    }
}
