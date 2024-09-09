package com.evgenypavlov.spring.model.user.university.university_iterator;

import com.evgenypavlov.spring.model.user.university.StudentGroup;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UniversityIterator <E> implements Iterator<E> {
    private List<E>eList = new ArrayList<>();
    private int count = 0;

    public UniversityIterator(StudentGroup university) {
    }

    @Override
    public boolean hasNext() {
        return eList.size() > count;
    }

    @Override
    public E next() {
        if (!hasNext()){
            return null;
        }
        count++;
        return eList.get(count);
    }

    @Override
    public void remove() {
        eList.remove(count);
    }
}
