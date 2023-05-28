package edu.sjsu.groupassignment;


public class Number
{
    public static boolean isPrime(int number)
    {
        /// Check whether number is Prime
        if (number < 2 || (number % 2 == 0))
            /// Fast check
            return false;

        if (number == 2)
            return true;

        for(int i = 3; i * i < number; ++i)
            if ( number % i == 0 )
                return false;

        return true;
    }

    public static boolean isInt(String input)
    {
        /// Checks whether string is parsable to int type
        try
        {
            Integer.parseInt(input);
        }
        catch (NumberFormatException e)
        {
            return false;
        }
        catch (NullPointerException e)
        {
            return false;
        }

        return true;
    }
}
