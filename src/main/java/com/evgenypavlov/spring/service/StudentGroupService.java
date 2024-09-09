package com.evgenypavlov.spring.service;

import com.evgenypavlov.spring.model.user.student.Student;
import com.evgenypavlov.spring.model.user.common_nterface.UserComparator;
import com.evgenypavlov.spring.model.user.student.StudyGroup;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class StudentGroupService {
    private StudyGroup studyGroup;


    public void removeStudentByFIO (String firstName,String lastName,String middleName){
        Iterator<Student>studentIterator = studyGroup.iterator();
        while (studentIterator.hasNext()){
            Student student = studentIterator.next();
            if (student.getFirstName().equals(firstName) &&
                    student.getLastName().equals(lastName ) && student.getMiddleName().equals(middleName)){
                studentIterator.remove();
            }
        }
    }

    public List<Student>SortStudentById(){
        List<Student>studentList = new ArrayList<>(studyGroup.getStudentList());
        Collections.sort(studentList);
        return studentList;
    }


    public List<Student>sortStudentByFIO(){
        List<Student>studentList = new ArrayList<>(studyGroup.getStudentList());
        studentList.sort(new UserComparator<Student>());
      return studentList;
    }

    public void crateStudent (String firstName,String lastName,String middleName){
        studyGroup.crateStudent(firstName,lastName,middleName);
    }
}
