package com.javarush.task.task29.task2909.human;

import java.util.ArrayList;
import java.util.List;

public class University  {

  private String name;
 private   int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private List<Student> students = new ArrayList();

    public List getStudents() {
        return students;
    }

    public void setStudents(List students) {
        this.students = students;
    }

    public University(String name, int age) {
        super();
    }

    public Student getStudentWithAverageGrade(double averageGrade) {

        for (Student student : students) {
            if (student.getAverageGrade() == averageGrade) {
                return student;
            }
        }
        return null;
    }

    public Student getStudentWithMaxAverageGrade() {
        double maxGrade = 0;
        for (Student student : students) {
            double currentGrade = student.getAverageGrade();
            if (currentGrade > maxGrade) {
                maxGrade = currentGrade;
            }
        }
        return getStudentWithAverageGrade(maxGrade);
    }

    public Student getStudentWithMinAverageGrade() {
        double minGrade = students.get(0).getAverageGrade();
        for (Student student : students) {
            double currentGrade = student.getAverageGrade();
            if (currentGrade < minGrade) {
                minGrade = currentGrade;
            }
        }
        return getStudentWithAverageGrade(minGrade);
    }

    public void expel(Student student){
        students.remove(student);
    }


    
}
