package edu.sjsu.assignment2;



public class Main
{
    public static void main(String[] args) {
        /// Check recursion
//        System.out.println(indexOf("Mississippi", "sip"));
//        System.out.println(indexOf("panda", "pan"));
//        System.out.println(indexOf("Hello world", "wow"));
//
//        /// Check time
//        String start_time, end_time;
//
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter Start Time: ");
//        start_time = input.next();
//
//        isParsable(start_time);
//
//        System.out.println("Enter End Time:");
//        end_time = input.next();
//
//        isParsable(end_time);
//
//        MyTime.printTimeDifference(start_time, end_time);

//        MyFile.writePrimes("in_data", "out_data");
        int[][] array1 = new int[][]{{2, 4}, {3, 4}};
        int[][] array2 = new int[][]{{1, 2}, {1, 3}};
        Matrix matrix1 = new Matrix(array1);
        Matrix matrix2 = new Matrix(array2);
        Matrix resultMatrix = matrix1.multiply(matrix2);
        int[][] resultArray = resultMatrix.getMatrix();

    }

    private static boolean isParsable(String string)
    {
        try
        {
            Integer.parseInt(string);
        }
        catch (NumberFormatException exception)
        {
            throw new ArithmeticException("Invalid input! Program terminated! ");
        }

        return true;
    }
}
