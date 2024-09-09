package com.evgenypavlov.spring.model.user.personal.teacher;

import com.evgenypavlov.spring.model.user.personal.Personal;

public class Teachers extends Personal implements Comparable<Teachers>,PersonalInterface {
    private Long teachersId;

    public Teachers(String firstName, String lastName, String middleName, int salary, String position) {
        super(firstName, lastName, middleName, salary, position);

    }

    @Override
    public int compareTo(Teachers o) {
        return Long.compare(this.teachersId,o.teachersId);
    }

    @Override
    public void comeToUniversity() {
        System.out.println("преподаватель пришел в университет ");
    }

    @Override
    public void dineOut() {
        System.out.println("у преподавателя обед");
    }

    @Override
    public void leaveTheUniversity() {
        System.out.println("рабочий день окончен");
    }

    @Override
    public void salaryPersonal() {
        System.out.println("зарплата преподвателя " + getSalary());
    }

    @Override
    public String positionShow() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder
                .append("имя :").append(getFirstName()).append("\n")
                .append("фамилия :").append(getLastName()).append("\n")
                .append("отчество :").append(getMiddleName()).append("\n")
                .append("предмет который ведет").append(getPosition());

        return stringBuilder.toString();
    }
    // 3)написал логику к клаасу учитель теперь класс студент и клас учитеь
    // реализуют только свою логику и имеют только одну причину для изминений

}










