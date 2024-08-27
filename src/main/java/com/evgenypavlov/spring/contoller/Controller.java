package com.evgenypavlov.spring.contoller;

import com.evgenypavlov.spring.model.data.Student;
import com.evgenypavlov.spring.model.data.StudyGroup;
import com.evgenypavlov.spring.model.service.StudentGroupService;
import com.evgenypavlov.spring.model.service.StreamService;

import java.util.List;

public class Controller {
    private final StudentGroupService service = new StudentGroupService();
    private final StreamService workerThreadService = new StreamService();


    public void removeStudentByFIO (String firstName,String lastName,String middleName){
        service.removeStudentByFIO(firstName,lastName,middleName);
    }

    public List<Student> studentList(){
        return service.SortStudentById();
    }

    public List<Student>sortStudentByFIO(){
       return service.sortStudentByFIO();
    }

    public List<StudyGroup> compareGroupsCount (){
       return workerThreadService.compareGroupsCount();
    }
}
