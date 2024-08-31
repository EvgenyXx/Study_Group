package com.evgenypavlov.spring.model.service;

import com.evgenypavlov.spring.model.data.stream.StreamComparator;
import com.evgenypavlov.spring.model.data.student.StudyGroup;
import com.evgenypavlov.spring.model.data.stream.Stream;

import java.util.ArrayList;
import java.util.List;

public class StreamService {
    private final Stream stream = new Stream();

    public List<StudyGroup> compareGroupsCount (){
        List<StudyGroup>studyGroupList = new ArrayList<>(stream.getStudyGroupList());
        studyGroupList.sort(new StreamComparator());
        return studyGroupList;
    }




}
