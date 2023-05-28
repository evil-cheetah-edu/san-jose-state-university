package edu.sjsu.assignment3;

import java.time.LocalDate;


/**
 * Holds One Time Appointment Information
 */
public class OnetimeAppointment extends Appointment
{
    /**
     * @param description holds the description of the appointment
     * @param start_date holds start date of the appointment, serves also as end date
     */
    public OnetimeAppointment(String description, LocalDate start_date)
    {
        super(description, start_date, start_date);
    }

    /**
     * @param date if the same as appointment date => true
     *             else => false
     * @return boolean
     */
    @Override
    public boolean occursOn(LocalDate date)
    {
        return date.isEqual( getStartDate() );
    }
}
