package com.evgenypavlov.spring.model.user.university;
import com.evgenypavlov.spring.model.user.common_nterface.User;
import com.evgenypavlov.spring.model.user.university.university_iterator.UniversityIterator;
import java.util.Iterator;

// 5)создал класс студент груп так же создал интерфейс студен менеджмет
// и класс студент лист в котором реализовал данынй интерфейс
// далее добавил студент менеджемтн в студен групп где и реализовал его
// принцип инверсии зависимости
public class StudentGroup implements Iterable<StudentGroup> {
    private final StudentManagementInterface studentManagementInterface = new StudentList();


    @Override
    public Iterator<StudentGroup> iterator() {
        return new UniversityIterator<StudentGroup>(this);
    }

   public void addStudent(User user){
        studentManagementInterface.addStudent(user);
   }

   public void removeStudent(String name){
        studentManagementInterface.removeStudent(name);
   }
}
