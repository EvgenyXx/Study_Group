package com.evgenypavlov.spring.service.stream;

import com.evgenypavlov.spring.model.user.student.StudyGroup;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Stream implements Iterator<StudyGroup>{

     private final List<StudyGroup>studyGroupList = new ArrayList<>();
     private  int count;

    public Stream() {
        count = 0;
    }

    public List<StudyGroup> getStudyGroupList() {
        return studyGroupList;
    }


    @Override
    public boolean hasNext() {
        return count < studyGroupList.size();
    }

    @Override
    public StudyGroup next() {
        if (!hasNext()){
            return null;
        }
        count++;
        return studyGroupList.get(count);
    }
}
