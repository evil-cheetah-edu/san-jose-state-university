package edu.sjsu.assignment4;

import java.util.*;


public class Gradebook extends HashMap<Student, Character>
{
    public boolean addStudent(Student student, char grade)
    {
        if (this.containsKey(student))
            return false;

        char actual_grade;

        switch (grade)
        {
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'F':
                actual_grade = grade;
                break;

            default:
                actual_grade = 'N';
        }

        this.put(student, actual_grade);

        return true;
    }

    public boolean addStudent(Student student)
    {
        return this.addStudent(student, 'N');
    }

    public boolean deleteStudent(int id)
    {
        Student student = _findStudent(id);

        if ( student == null )
            return false;

        this.remove(student);
        return true;
    }

    public boolean updateStudent(int id, String newName)
    {
        Student student = _findStudent(id);

        if ( student == null )
            return false;

        student.setName(newName);

        return true;
    }

    public boolean updateGrade(int id, char newGrade)
    {
        if (
            newGrade != 'A' &&
            newGrade != 'B' &&
            newGrade != 'C' &&
            newGrade != 'D' &&
            newGrade != 'F' &&
            newGrade != 'N'
        )
            return false;


        Student student = _findStudent(id);

        if ( student == null )
            return false;

        this.put(student, newGrade);

        return true;
    }

    public void printGrades(Comparator<Student> comparator) {
        Object[] students = this.keySet().toArray();

        for (Object student : students)
        {
            System.out.println(student.toString() + ": " + this.get(student));
        }
    }

    private Student _findStudent(int id)
    {
        for (Student student : this.keySet())
            if ( student.getId() == id )
                return student;

        return null;
    }
}
