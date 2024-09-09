package com.evgenypavlov.spring.view;

import com.evgenypavlov.spring.model.user.User;

import java.util.List;

public interface UserView <T extends User>{
    void sendOnConsole(List<T>studentList);
}
