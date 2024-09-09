package com.evgenypavlov.spring.model.user.university;

import com.evgenypavlov.spring.model.user.common_nterface.User;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentList implements StudentManagementInterface{
    private final List<User>userList = new ArrayList<>();

    @Override
    public void addStudent(User user) {
      userList.add(user);
    }

    @Override
    public void removeStudent(String name) {
        Iterator<User>userIterator = userList.iterator();
        while (userIterator.hasNext()){
            User user = userIterator.next();
            if (user.getFirstName().equals(name)){
                userIterator.remove();
            }
        }
    }
}
