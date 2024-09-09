package com.evgenypavlov.spring.model.user.student;


import com.evgenypavlov.spring.model.user.common_nterface.User;

public class Student extends User implements Comparable<Student> {

     private  long studentId;

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public Student(String firstName, String lastName, String middleName) {
        super(firstName, lastName, middleName);
    }


    @Override
    public int compareTo(Student o) {
        return Long.compare(this.studentId,o.studentId);
    }

    @Override
    public void comeToUniversity() {
        System.out.println("студент пришел в университет");
    }

    @Override
    public void dineOut() {
        System.out.println("студент пошел победать");
    }

    @Override
    public void leaveTheUniversity() {
        System.out.println("учебный день окончен студент может идти спокойно");
    }
//    реализовал только что созданный класс  интерфейс юзер
}
