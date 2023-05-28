package edu.sjsu.assignment3;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.Arrays;


public class Main
{
    public static void main(String[] args)
    {
        /// Initialize Start and End dates
        LocalDate startDate = LocalDate.parse("2022-01-27");
        LocalDate endDate   = LocalDate.parse("2022-05-18");

        /// Initialize 3 test dates
        LocalDate testDate1 = LocalDate.parse("2022-01-27");
        LocalDate testDate2 = LocalDate.parse("2022-03-18");
        LocalDate testDate3 = LocalDate.parse("2022-05-27");

        /// Testing OneTimeAppointment
        System.out.println("Testing OneTimeAppointment:");
        Appointment OTA = new OnetimeAppointment("Class starts", startDate);
        System.out.println( OTA.occursOn(testDate1) ); // returns true
        System.out.println( OTA.occursOn(testDate2) ); // returns false (not the same date)
        System.out.println( OTA.occursOn(testDate3) ); // returns false (not the same date)
        System.out.println("\n");

        /// Testing DailyAppointment
        System.out.println("Testing DailyAppointment:");
        Appointment DA = new DailyAppointment("Class", startDate, endDate);
        System.out.println( DA.occursOn(testDate1) ); // returns true
        System.out.println( DA.occursOn(testDate2) ); // returns true
        System.out.println( DA.occursOn(testDate3) ); // returns false (after the end date)
        System.out.println("\n");

        /// Testing MonthlyAppointment
        System.out.println("Testing MonthlyAppointment:");
        Appointment MA = new MonthlyAppointment("Meeting", startDate, endDate);
        System.out.println( MA.occursOn(testDate1) ); // returns true
        System.out.println( MA.occursOn(testDate2) ); // returns false (day of month not same)
        System.out.println( MA.occursOn(testDate3) ); // returns false (after the end date)

        System.out.println();

        /// Compare Variables
        Appointment a1 = new OnetimeAppointment(
                "Class starts",
                LocalDate.parse("2022-01-27")
        );
        Appointment a2 = new DailyAppointment(
                "Class",
                LocalDate.parse("2022-01-27"),
                LocalDate.parse("2022-05-18")
        );
        Appointment a3 = new DailyAppointment(
                "Assignments",
                LocalDate.parse("2022-02-16"),
                LocalDate.parse("2022-05-16")
        );
        Appointment a4 = new MonthlyAppointment(
                "A meeting",
                LocalDate.parse("2022-01-27"),
                LocalDate.parse("2022-05-18")
        );
        Appointment a5 = new MonthlyAppointment(
                "A meeting",
                LocalDate.parse("2022-02-16"),
                LocalDate.parse("2022-05-18")
        );

        /// Initialize Appointment Array
        Appointment[] appointments = {a1, a2, a3, a4, a5};

        /// Sorting using CompareTo
        Arrays.sort(appointments);
        System.out.println("CompareTo sort:");
        System.out.println( Arrays.toString(appointments) );
        System.out.println();

        /// Sorting using Comparator
        Arrays.sort(appointments, new DesComparator());
        System.out.println("Comparator sort:");
        System.out.println( Arrays.toString(appointments) );

        /// Comparing using Comparable

    }
}
