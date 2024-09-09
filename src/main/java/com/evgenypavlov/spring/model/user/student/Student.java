package com.evgenypavlov.spring.model.user.student;


import com.evgenypavlov.spring.model.user.User;

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
}
