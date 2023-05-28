package edu.sjsu.assignment2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class MyFile
{
    public static void writePrimes(String in_file, String out_file) {
        String out_data = "";

        try (BufferedReader br = new BufferedReader(new FileReader(in_file)))
        {
            String line;
            while( (line = br.readLine()) != null )
            {
                List<String> items = Arrays.asList(line.split(","));
                for (String item : items)
                {
                    if (isNumber(item) && isPrime(item))
                        out_data += item + "\n";
                }
            }

            Files.write( Paths.get(out_file), out_data.getBytes() );
        }
        catch (FileNotFoundException exception)
        {
            System.out.println("File with filename " + in_file + " was not found");
        }
        catch (IOException exception)
        {
            System.out.println("IOException");
        }

    }

    private static boolean isNumber(String string)
    {
        try
        {
            Integer.parseInt(string);
            return true;
        }
        catch (NumberFormatException exception)
        {
            return false;
        }
    }

    private static boolean isPrime(String n)
    {
        int number = Integer.parseInt(n);

        if ( number < 2 )
            return false;

        if ( number <= 3 )
            return true;

        for (int divisor = 2; divisor <= Math.sqrt(number); ++divisor)
            if ( number % divisor == 0)
                return false;

        return true;
    }
}
