package edu.sjsu.assignment3;

import java.time.LocalDate;


public abstract class Appointment
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
}
