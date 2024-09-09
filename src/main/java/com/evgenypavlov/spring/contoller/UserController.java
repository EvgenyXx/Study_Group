package com.evgenypavlov.spring.contoller;

import com.evgenypavlov.spring.model.user.common_nterface.User;

public interface UserController <T extends User> {

    void  create (String firstName,String lastName,String middleName);
}
