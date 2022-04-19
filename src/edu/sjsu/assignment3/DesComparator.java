package edu.sjsu.assignment3;

import java.util.Comparator;


public class DesComparator implements Comparator<Appointment>
{
    @Override
    public int compare(Appointment a1, Appointment a2)
    {
        /// Check Description
        if ( !a1.getDescription().equals(a2.getDescription()))
            return a1.getDescription().compareTo( a2.getDescription() );

        /// If Description is the same, Check Start Date
        if ( !a1.getStartDate().isEqual( a2.getStartDate() ) )
            return a1.getStartDate().compareTo( a2.getStartDate() );

        /// If Start Date is the same, Check End Date
        return a1.getEndDate().compareTo( a2.getEndDate() );
    }
}
