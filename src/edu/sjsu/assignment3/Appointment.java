package edu.sjsu.assignment3;

import java.time.LocalDate;


public abstract class Appointment implements Comparable<Appointment>
{
    private final String    description;
    private final LocalDate startDate;
    private final LocalDate endDate;

    public Appointment(String description, LocalDate start_date, LocalDate end_date)
    {
        this.description = description;
        this.startDate   = start_date;
        this.endDate     = end_date;
    }

    public String    getDescription() { return this.description; }
    public LocalDate getStartDate()   { return this.startDate;   }
    public LocalDate getEndDate()     { return this.endDate;     }

    public abstract boolean occursOn(LocalDate date);

    @Override
    public int compareTo(Appointment a)
    {
        /// Check Description
        if ( !startDate.isEqual( a.startDate ) )
            return startDate.compareTo( a.startDate );

        /// If Description is the same, Check Start Date
        if ( !endDate.isEqual( a.endDate ) )
            return endDate.compareTo( a.endDate );

        /// If Start Date is the same, Check End Date
        return description.compareTo( a.description );
    }

    @Override
    public String toString()
    {
        return getDescription() + ' ' + getStartDate() + ' ' + getEndDate();
    }
}
