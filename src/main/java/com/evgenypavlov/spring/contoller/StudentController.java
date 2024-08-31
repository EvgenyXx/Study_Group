package com.evgenypavlov.spring.contoller;

import com.evgenypavlov.spring.model.data.student.Student;
import com.evgenypavlov.spring.model.data.student.StudyGroup;
import com.evgenypavlov.spring.model.service.StudentGroupService;
import com.evgenypavlov.spring.model.service.StreamService;
import com.evgenypavlov.spring.view.StudentView;

import java.util.List;

public class StudentController  implements UserController<Student>{
    private final StudentGroupService studentGroupService = new StudentGroupService();
    private final StreamService workerThreadService = new StreamService();
    private final StudentView studentView = new StudentView();


    public void removeStudentByFIO(String firstName, String lastName, String middleName) {
       studentGroupService.removeStudentByFIO(firstName,lastName,middleName);
    }

    public List<Student> sortByIdstudentList() {
        List<Student>studentList = studentGroupService.SortStudentById();
        studentView.sendOnConsole(studentList);
        return studentList;
    }

    public List<Student> sortStudentByFIO() {
        List<Student>studentList = studentGroupService.sortStudentByFIO();
        studentView.sendOnConsole(studentList);
        return studentList;
    }

    public List<StudyGroup> compareGroupsCount() {
        return workerThreadService.compareGroupsCount();
    }

    @Override
    public void create(String firstName, String lastName, String middleName) {
         studentGroupService.crateStudent(firstName,lastName,middleName);
    }
}