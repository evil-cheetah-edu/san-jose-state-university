package edu.sjsu.assignment3;

import java.time.LocalDate;


public abstract class Appointment implements Comparable<Appointment>
{
    private final String    description;
    private final LocalDate startDate;
    private final LocalDate endDate;

    /**
     * @param description holds the description of the appointment
     * @param start_date  holds start date of the appointment,
     *                    day of the month work as appointment day
     * @param end_date    holds end date of the appointment
     */
    public Appointment(String description, LocalDate start_date, LocalDate end_date)
    {
        this.description = description;
        this.startDate   = start_date;
        this.endDate     = end_date;
    }

    /** @return description */
    public String    getDescription() { return this.description; }
    /** @return start_date */
    public LocalDate getStartDate()   { return this.startDate;   }
    /** @return end_date */
    public LocalDate getEndDate()     { return this.endDate;     }

    /** @param date the date that should be compared to find whether
     *              an appointment occurs on the date
     * @return boolean
     */
    public abstract boolean occursOn(LocalDate date);

    /**
     * @param a value that the class is compared to
     * @return integer index
     */
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

    /**
     * @return string representation of the class
     */
    @Override
    public String toString()
    {
        return getDescription() + ' ' + getStartDate() + ' ' + getEndDate();
    }
}
