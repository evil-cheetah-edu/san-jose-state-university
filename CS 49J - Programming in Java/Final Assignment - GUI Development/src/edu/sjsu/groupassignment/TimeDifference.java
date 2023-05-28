package edu.sjsu.groupassignment;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ContainerAdapter;

public class TimeDifference
{
    private JTextField first_time_entry_box;
    private JTextField second_time_entry_box;
    private JButton calculate_button;
    private JLabel first_entry_check;
    private JLabel second_entry_check;
    private JLabel result;
    private JPanel main_panel;

    public TimeDifference() {
        calculate_button.addActionListener(
            e ->
            {
                String first_time  = first_time_entry_box.getText();
                String second_time = second_time_entry_box.getText();

                if ( !MyTime.isHHMM(first_time) )
                    first_entry_check.setText("Time must be in proper 'HHMM' format");

                if ( !MyTime.isHHMM(second_time) )
                    second_entry_check.setText("Time must be in proper 'HHMM' format");

                if ( MyTime.isHHMM(first_time) && MyTime.isHHMM(second_time) )
                {
                    first_entry_check.setText("");
                    second_entry_check.setText("");
                    result.setText(MyTime.getTimeDifference(first_time, second_time));
                }
            }
        );

    }

    public static void main(String[] args)
    {
        JFrame frame = new JFrame("TimeDifference");
        frame.setContentPane(new TimeDifference().main_panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
