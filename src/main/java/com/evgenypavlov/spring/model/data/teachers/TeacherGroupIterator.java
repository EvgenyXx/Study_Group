package com.evgenypavlov.spring.model.data.teachers;

import com.evgenypavlov.spring.model.data.student.Student;
import com.evgenypavlov.spring.model.data.student.StudyGroup;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TeacherGroupIterator implements Iterator<Teachers> {
    private  int count;
    private final List<Teachers> teachersList;

    public TeacherGroupIterator(TeacherGroup teachers) {
        this.count = 0;
        teachersList = new ArrayList<>();

    }

    @Override
    public boolean hasNext() {
        return    count < teachersList.size();
    }

    @Override
    public Teachers next() {
        if (!hasNext()){
            return null;
        }
        count++;
        return teachersList.get(count);
    }

    @Override
    public void remove() {
        teachersList.remove(count);
    }
}
