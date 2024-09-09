package com.evgenypavlov.spring.contoller;

import com.evgenypavlov.spring.model.user.personal.teacher.Teachers;
import com.evgenypavlov.spring.service.TeacherService;
import com.evgenypavlov.spring.view.TeacherVIew;

import java.util.List;

public class TeacherController implements UserController<Teachers>{
    private final TeacherService teacherService = new TeacherService();
    private final TeacherVIew teacherVIew = new TeacherVIew();


    public void removeStudentByFIO (String firstName,String lastName,String middleName,String lesson){
        teacherService.removeStudentByFIO(firstName,lastName,middleName,lesson);
    }

    public List<Teachers> sortByTeacher(){
        List<Teachers>teachersList = teacherService.sortByTeacher();
        teacherVIew.sendOnConsole(teachersList);
       return teachersList;
    }

    public List<Teachers> sortTeacherByFIO(){
        List<Teachers>teachers = teacherService.sortTeacherByFIO();
        teacherVIew.sendOnConsole(teachers);
        return teachers;
    }

//    public void crateStudent (String firstName,String lastName,String middleNam){
//        teacherService.crateTeacher(firstName,lastName,middleNam);
//    }

    @Override
    public void create(String firstName, String lastName, String middleName) {
      teacherService.crateTeacher(firstName,lastName,middleName);
    }
}
