package com.evgenypavlov.spring.model.user.teachers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TeacherGroup implements  Iterable<Teachers>{
    private final List<Teachers>teachersList = new ArrayList<>();

    public List<Teachers> getTeachersList() {
        return teachersList;
    }

    @Override
    public Iterator<Teachers> iterator() {
      return new TeacherGroupIterator(this);
    }

   public void createTeacher(String firstName,String lastName,String middleName){
        teachersList.add(new Teachers(firstName,lastName,middleName));
   }
}
