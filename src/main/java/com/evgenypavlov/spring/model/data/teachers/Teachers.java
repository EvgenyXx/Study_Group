package com.evgenypavlov.spring.model.data.teachers;

import com.evgenypavlov.spring.model.data.User;

public class Teachers extends User implements Comparable<Teachers> {
    private long teachersId;
    private final String lesson;

    public String getLesson() {
        return lesson;
    }

    public Teachers(String firstName, String lastName, String middleName,String lesson) {
        super(firstName, lastName, middleName);
        this.lesson = lesson;
    }

    @Override
    public int compareTo(Teachers o) {
        return Long.compare(this.teachersId,o.teachersId);
    }
}
