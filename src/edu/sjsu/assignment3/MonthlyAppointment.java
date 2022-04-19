package edu.sjsu.assignment3;

import java.time.LocalDate;


public class MonthlyAppointment extends Appointment
{
    /**
     * @param description holds the description of the appointment
     * @param start_date holds start date of the appointment
     * @param end_date holds end date of the appointment
     */
    public MonthlyAppointment(String description, LocalDate start_date, LocalDate end_date)
    {
        super(description, start_date, end_date);
    }

    /**
     * @param date if within range & DoM equals to appointment DoM => true
     *             else false
     * @return boolean
     */
    @Override
    public boolean occursOn(LocalDate date)
    {
        return (
            !date.isBefore( getStartDate() ) &&
            !date.isAfter(  getEndDate()   ) &&
            (date.getDayOfMonth() == getStartDate().getDayOfMonth())
        );
    }
}
