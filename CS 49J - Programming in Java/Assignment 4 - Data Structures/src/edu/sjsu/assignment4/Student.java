package edu.sjsu.assignment4;


import java.util.Objects;

public class Student implements Comparable<Student>
{
    private int id;
    private String name;


    public Student(int id)
    {
        this(id, "Unnamed");
    }

    public Student(int id, String name)
    {
        this.id   = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public int compareTo(Student o)
    {
        if ( !name.equals(o.name) )
            return name.compareTo(o.name);

        return id - o.id;
    }

    @Override
    public String toString()
    {
        return Integer.toString(getId()) + '.' + getName();
    }

    public int    getId()   { return this.id;   }
    public String getName() { return this.name; }

    public void setName(String name) { this.name = name; }
    public void setId(int id)        { this.id = id;     }
}
