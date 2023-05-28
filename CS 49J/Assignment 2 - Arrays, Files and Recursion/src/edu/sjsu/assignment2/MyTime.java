package edu.sjsu.assignment2;


public class MyTime
{
    public static void printTimeDifference(String first_military_time, String second_military_time)
    {
        /// Parse Strings to Integers
        int start_time = _convert_military_time_to_minutes( first_military_time );
        int end_time   = _convert_military_time_to_minutes( second_military_time );

        /// Find difference
        int difference = end_time - start_time;

        /// From Specs:
        ///     If the first time is later than the
        ///     second time, assume the second time is the next day
        ///
        ///     In other words,
        ///     Add 24 hours, which is 1440 minutes
        if ( difference < 0 )
            difference += 1440;

        System.out.println((difference / 60) + " hour(s) " + (difference % 60) + " minutes ");
    }

    private static int _convert_military_time_to_minutes(String military_time)
    {
        int time = Integer.parseInt(military_time);

        return ( (time / 100 * 60) + time % 100);
    }
}
