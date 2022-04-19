package edu.sjsu.assignment3;

import java.time.LocalDate;


public class OnetimeAppointment extends Appointment
{
    public OnetimeAppointment(String description, LocalDate start_date)
    {
        super(description, start_date, start_date);
    }

    @Override
    public boolean occursOn(LocalDate date)
    {
        return date.isEqual( getStartDate() );
    }
}
