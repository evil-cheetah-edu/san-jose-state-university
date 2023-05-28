package edu.sjsu.assignment4;


public class Main
{
    public static void main(String[] args)
    {
        Gradebook gradebook = new Gradebook();
        System.out.println("Inserting:");
        System.out.println( gradebook.addStudent( new Student(3, "Alice") ) );
        System.out.println( gradebook.addStudent( new Student(4, "Alice") ) );
        System.out.println( gradebook.addStudent( new Student(1, "Bob"), 'I' ) );
        System.out.println( gradebook.addStudent( new Student(5, "Unnamed"), 'B' ) );
        System.out.println( gradebook.addStudent( new Student(5, "Eve"), 'D') );
        System.out.println( gradebook.addStudent( new Student(1, "Trudy") ) );
        System.out.println( gradebook.addStudent( new Student(2, "Cathy") ) );
        System.out.println();

        System.out.println("Deleting:");
        System.out.println( gradebook.deleteStudent(4) );
        System.out.println( gradebook.deleteStudent(6) );
        System.out.println( gradebook.deleteStudent(4) );
        System.out.println( gradebook.updateGrade(1, 'J') );
        System.out.println();

        System.out.println("Updating Grades:");
        System.out.println( gradebook.updateGrade(3, 'A') );
        System.out.println( gradebook.updateGrade(3, 'B') );
        System.out.println( gradebook.updateGrade(5, 'C') );
        System.out.println( gradebook.updateGrade(6, 'B') );
        System.out.println( gradebook.updateGrade(1, 'C') );

        gradebook.printGrades(Student::compareTo);
    }
}
