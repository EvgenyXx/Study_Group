package com.evgenypavlov.spring.model.user.university;

import com.evgenypavlov.spring.model.user.common_nterface.User;

public interface StudentManagementInterface {
    void addStudent(User user);
    void  removeStudent(String name);
}
