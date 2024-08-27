package com.evgenypavlov.spring.model.data;

import com.evgenypavlov.spring.model.User;



public class Student extends User  {
    public Student(int id, String firstName, String lastName, String middleName) {
        super(id, firstName, lastName, middleName);
    }


    @Override
    public int compareTo(User o) {
        return Integer.compare(this.getId(),o.getId());
    }
}
