package edu.sjsu.groupassignment;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CardDescription {
    private JPanel panel1;
    private JTextField card_shorthand_entry;
    private JButton get_description_button;
    private JLabel card_description;

    public CardDescription() {
        get_description_button.addActionListener(
            e ->
            {
                String shorthand = card_shorthand_entry.getText();
                Card card = new Card(shorthand);
                String description = card.getDescription();

                if (description.equals("Unknown"))
                {
                    card_description.setForeground( Color.RED );
                }
                else
                {
                    card_description.setForeground( Color.BLACK );
                }

                card_description.setText( description );
            }
        );
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("CardDescription");
        frame.setContentPane(new CardDescription().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
