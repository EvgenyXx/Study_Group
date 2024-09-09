package com.evgenypavlov.spring.view;

import com.evgenypavlov.spring.model.user.personal.teacher.Teachers;

import java.util.List;

public class TeacherVIew implements UserView<Teachers> {
    @Override
    public void sendOnConsole(List<Teachers> studentList) {
        for (Teachers teachers : studentList){
            System.out.println(teachers.getLastName());
        }
    }
}
