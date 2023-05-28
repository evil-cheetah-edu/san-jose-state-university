package edu.sjsu.groupassignment;


import java.util.regex.Pattern;

public class MyTime
{
    public static String getTimeDifference(String first_military_time, String second_military_time)
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

        return ( (difference / 60) + " hour(s) " + (difference % 60) + " minute(s)" );
    }

    private static int _convert_military_time_to_minutes(String military_time)
    {
        int time = Integer.parseInt(military_time);

        return ( (time / 100 * 60) + time % 100);
    }

    public static boolean isHHMM(String user_input)
    {
        /// Matching using Regex
        /// ^               - beginning of the string
        /// ([01]\d|2[0-3]) - (0 or 1 with any digit) or ('2' with digit from 0 to 3)
        /// ([0-5]\d)       - (digit from 0 to 5 with any digit)
        /// $               - end of the string
        /// ()              - capture group, works similar to []
        ///
        /// Additional Credit to https://bit.ly/3sDPiDC for regex validation
        Pattern pattern = Pattern.compile("^([01]\\d|2[0-3])([0-5]\\d)$");

        return pattern.matcher(user_input).find();
    }
}
