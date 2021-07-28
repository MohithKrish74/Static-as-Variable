package com.keyword;

class Student
{
    int roll_no;
    String student_name;
    static String school_name="Montessori";
    public Student(int roll_no,String student_name)
    {
        this.roll_no=roll_no;
        this.student_name=student_name;
        System.out.println(roll_no+" "+student_name+" "+school_name);
    }

}

public class StaticAsVariable
{
    public static void main(String[] args)
    {
        Student student1 = new Student(1,"Ram");
        Student student2 = new Student(2,"Sam");


    }
}
