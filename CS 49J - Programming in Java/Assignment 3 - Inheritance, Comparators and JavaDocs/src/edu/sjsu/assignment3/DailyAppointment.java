package edu.sjsu.assignment3;

import java.time.LocalDate;


/**
 * Holds Daily Appointment Information
 */
public class DailyAppointment extends Appointment
{
    /**
     * @param description holds description of the appointment
     * @param start_date holds start date of the appointment
     * @param end_date holds end date of the appointment
     */
    public DailyAppointment(String description, LocalDate start_date, LocalDate end_date)
    {
        super(description, start_date, end_date);
    }

    /**
     *
     * @param date if date within range => true
     *             else => false
     * @return boolean
     */
    @Override
    public boolean occursOn(LocalDate date)
    {
        return (
            !date.isBefore( getStartDate() ) &&
            !date.isAfter(  getEndDate()   )
        );
    }
}
