package edu.sjsu.assignment4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;


public class MyCollection {
    public static void printFiles(Queue<File> files)
    {
        while (!files.isEmpty())
            _printFile( files.poll() );
    }

    public static void downsize(LinkedList<String> employees, int nth)
    {
        Iterator<String> iterator = employees.listIterator();

        for (int i = 0; iterator.hasNext(); ++i)
            if (i % nth == 0)
                iterator.remove();
    }

    public static boolean isBalanced(String expression) {
        Stack<Character> balance_stack = new Stack<>();

        for (char character : expression.toCharArray()) {
            switch (character)
            {
                case '(':
                {
                    balance_stack.push(')');

                    break;
                }

                case '[':
                {
                    balance_stack.push(']');

                    break;
                }

                case ')':
                {
                    if (balance_stack.peek() != ')')
                        return false;

                    balance_stack.pop();

                    break;
                }

                case ']':
                {
                    if (balance_stack.peek() != ']')
                        return false;

                    balance_stack.pop();

                    break;
                }
            }
        }

        return balance_stack.isEmpty();
    }

    private static void _printFile(File file)
    {
        try
        {
            Scanner scanner = new Scanner(file);

            while ( scanner.hasNextLine() )
                System.out.println( scanner.nextLine() );

            System.out.println("***");
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
    }
}
