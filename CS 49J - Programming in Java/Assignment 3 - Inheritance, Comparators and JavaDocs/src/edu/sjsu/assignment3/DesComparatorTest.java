package edu.sjsu.assignment3;

import org.testng.annotations.Test;

import java.time.LocalDate;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class DesComparatorTest
{

    @Test
    public void compare()
    {
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
        Appointment[] actual   = { a1, a2, a3, a4, a5 };
        Appointment[] expected = { a4, a5, a3, a2, a1 };

        Arrays.sort(actual, new DesComparator());

        assertArrayEquals(expected, actual);
    }
}