package com.evgenypavlov.spring.model.data.student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudyGroup implements Iterable<Student>{
    private List<Student>studentList = new ArrayList<>();

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public void crateStudent (String firstName,String lastName,String middleName){
        studentList.add(new Student(firstName,lastName,middleName));
    }

    @Override
    public Iterator<Student> iterator() {
        return  new StudentGroupIterator(this);
    }
}
