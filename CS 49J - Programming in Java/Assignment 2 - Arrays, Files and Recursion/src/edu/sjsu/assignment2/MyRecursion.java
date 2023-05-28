package edu.sjsu.assignment2;

public class MyRecursion
{
    public static int indexOf(String original_string, String sub_string)
    {
        /// Check if null
        if ((original_string == null) || (sub_string == null))
            return -1;

        /// Check if ""
        if (original_string.isEmpty() || sub_string.isEmpty())
            return -1;

        /// Check if original string is shorter
        if (original_string.length() < sub_string.length())
            return -1;

        /// If it starts, return
        if (original_string.startsWith(sub_string))
            return 0;

        /// Inefficient
        /// Checks whether the return value is -1
        /// If not sums the indexes
        return indexOf(original_string.substring(1), sub_string) == -1 ?
                -1 :
                indexOf(original_string.substring(1), sub_string) + 1;
    }
}
