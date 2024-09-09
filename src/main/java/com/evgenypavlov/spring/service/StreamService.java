package com.evgenypavlov.spring.service;

import com.evgenypavlov.spring.service.stream.StreamComparator;
import com.evgenypavlov.spring.model.user.student.StudyGroup;
import com.evgenypavlov.spring.service.stream.Stream;

import java.util.ArrayList;
import java.util.List;

public class StreamService {
    private final Stream stream  = new Stream();


    public List<StudyGroup> compareGroupsCount (){
        List<StudyGroup>studyGroupList = new ArrayList<>(stream.getStudyGroupList());
        studyGroupList.sort(new StreamComparator());
        return studyGroupList;
    }




}
