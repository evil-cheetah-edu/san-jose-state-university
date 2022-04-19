package edu.sjsu.assignment3;

import java.time.LocalDate;


public class MonthlyAppointment extends Appointment
{
    public MonthlyAppointment(String description, LocalDate start_date, LocalDate end_date)
    {
        super(description, start_date, end_date);
    }

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
