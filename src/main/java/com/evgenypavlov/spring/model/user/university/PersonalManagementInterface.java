package com.evgenypavlov.spring.model.user.university;

import com.evgenypavlov.spring.model.user.common_nterface.User;
import com.evgenypavlov.spring.model.user.personal.Personal;

public interface PersonalManagementInterface {
    void addPersonal(User user);
    void removePersonal(String name);

}
