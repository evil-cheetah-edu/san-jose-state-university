package edu.sjsu.groupassignment;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;

public class PrimeNumber
{
    private JPanel panel1;
    private JPanel main_panel;
    private JTextField numbers_entry_box;
    private JButton find_primes_button;
    private JButton check_if_prime_button;
    private JLabel result;
    private JLabel find_primes_error_message;
    private JLabel check_if_prime_error_message;
    private JLabel additional_results;

    public PrimeNumber() {


        find_primes_button.addActionListener(
            e ->
            {
                /// Additional Credit for Regex Delimeter Set
                /// https://bit.ly/3wzSVvd
                String[] inputs = numbers_entry_box
                        .getText()
                        .split("\\t|,|;|\\.|\\?|!|-|:|@|\\[|\\]|\\(|\\)|\\{|\\}|_|\\*|/");

                ArrayList<String> prime_numbers = new ArrayList<>();

                for (String input : inputs)
                {
                    String number = input.strip();

                    if ( !Number.isInt(number) )
                    {
                        find_primes_error_message.setText("Unable to do Operation! Ensure that all numbers in text field are Integers!");
                        check_if_prime_error_message.setText("");
                        return;
                    }

                    System.out.println(Integer.parseInt(number));

                    if ( Number.isPrime( Integer.parseInt(number) ) )
                        prime_numbers.add(number);
                }

                find_primes_error_message.setText("");
                check_if_prime_error_message.setText("");

                result.setText(
                    prime_numbers.isEmpty() ?
                        "No Prime numbers Found" :
                        "Prime Numbers: " + String.join(", ", prime_numbers)
                );
            }
        );
        check_if_prime_button.addActionListener(
            e ->
            {
                if ( numbers_entry_box.getText().split(",").length > 1 )
                {
                    find_primes_error_message.setText("");
                    check_if_prime_error_message.setText("Unable to do Operation! Ensure there is only 1 number in text field!");
                    return;
                }

                if ( !Number.isInt(numbers_entry_box.getText().strip()) )
                {
                    find_primes_error_message.setText("");
                    check_if_prime_error_message.setText("The input cannot be converted to Integer!");
                    return;
                }


                find_primes_error_message.setText("");
                check_if_prime_error_message.setText("");

                int number = Integer.parseInt( numbers_entry_box.getText().strip() );

                result.setText( Number.isPrime(number) ? "Is Prime Number" : "Is NOT Prime Number" );
                additional_results.setText(
                    Number.isPrime(number) ?
                        ""                 :
                        "Factors: " + this.getFactors(number));
            }
        );
    }

    private String getFactors(int number)
    {
        ArrayList<String> factors = new ArrayList<>();

        for (int i = 2; i <= number; ++i)
        {
            while ( number % i == 0)
            {
                number /= i;
                factors.add(Integer.toString(i));
            }
        }

        Collections.sort(factors);
        return String.join(", ", factors);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("PrimeNumber");
        frame.setContentPane(new PrimeNumber().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
