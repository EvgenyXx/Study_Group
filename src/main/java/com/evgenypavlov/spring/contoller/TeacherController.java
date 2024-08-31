package com.evgenypavlov.spring.contoller;

import com.evgenypavlov.spring.model.data.teachers.TeacherGroup;
import com.evgenypavlov.spring.model.data.teachers.Teachers;
import com.evgenypavlov.spring.model.service.TeacherService;

import java.util.List;

public class TeacherController implements UserController<Teachers>{
    private TeacherService teacherService;
    public void removeStudentByFIO (String firstName,String lastName,String middleName,String lesson){
        teacherService.removeStudentByFIO(firstName,lastName,middleName,lesson);
    }

    public List<Teachers> sortByTeacher(){
       return teacherService.sortByTeacher();
    }

    public List<Teachers> sortTeacherByFIO(){
        return teacherService.sortTeacherByFIO();
    }

    public void crateStudent (String firstName,String lastName,String middleNam,String lesson){
        teacherService.crateStudent(firstName,lastName,middleNam,lesson);
    }

    @Override
    public void create(String firstName, String lastName, String middleName) {

    }
}