package com.evgenypavlov.spring.model.user.student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentGroupIterator implements Iterator<Student>{
    private  int count;
    private final List<Student>studentList;

    public StudentGroupIterator(StudyGroup studyGroup) {
        this.count = 0;
        studentList= new ArrayList<>();

    }

    @Override
    public boolean hasNext() {
      return    count < studentList.size();
    }

    @Override
    public Student next() {
        if (!hasNext()){
            return null;
        }
        count++;
        return studentList.get(count);
    }

    @Override
    public void remove() {
        studentList.remove(count);
    }
}
