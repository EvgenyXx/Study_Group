package com.evgenypavlov.spring.view;

import com.evgenypavlov.spring.contoller.StudentController;
import com.evgenypavlov.spring.model.user.student.Student;

import java.util.List;

public class StudentView implements UserView <Student> {
    private final StudentController studentController = new StudentController();


    @Override
    public void sendOnConsole(List<Student> studentList) {
      for(Student student : studentList){
          System.out.println(student.getFirstName());
      }

    }
}
