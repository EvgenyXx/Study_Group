package com.evgenypavlov.spring.model.service;

import com.evgenypavlov.spring.model.data.UserComparator;
import com.evgenypavlov.spring.model.data.teachers.TeacherGroup;
import com.evgenypavlov.spring.model.data.teachers.Teachers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TeacherService {
    private TeacherGroup teachers;
    public void removeStudentByFIO (String firstName,String lastName,String middleName,String lesson){
        Iterator<Teachers> teachersIterator = teachers.iterator();
        while (teachersIterator.hasNext()){
            Teachers teachers1 = teachersIterator.next();
            if (teachers1.getFirstName().equals(firstName) &&
                    teachers1.getLastName().equals(lastName ) &&
                    teachers1.getMiddleName().equals(middleName)){
                teachersIterator.remove();
            }
        }
    }

    public List<Teachers> sortByTeacher(){
        List<Teachers> teachersList = new ArrayList<>(teachers.getTeachersList());
        Collections.sort(teachersList);
        return teachersList;
    }


    public List<Teachers> sortTeacherByFIO(){
        List<Teachers> teachersList = new ArrayList<>(teachers.getTeachersList());
        teachersList.sort(new UserComparator<Teachers>());
        return teachersList;
    }

    public void crateTeacher(String firstName, String lastName, String middleNam){
        teachers.createTeacher(firstName,lastName,middleNam);
    }




}
