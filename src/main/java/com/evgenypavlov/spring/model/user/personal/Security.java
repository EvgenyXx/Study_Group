package com.evgenypavlov.spring.model.user.personal;

public class Security extends Personal implements CapableOfGuarding{

    public Security(String firstName, String lastName, String middleName, int salary, String position) {
        super(firstName, lastName, middleName, salary, position);
    }
    @Override
    public void comeToUniversity() {
        System.out.println("охранник пришел в университет ");
    }

    @Override
    public void dineOut() {
        System.out.println("у охраны обед");
    }

    @Override
    public void leaveTheUniversity() {
        System.out.println("рабочий день окончен");
    }

    @Override
    public void letsIn() {
        System.out.println("охранник впускает студентов и преподавателей");
    }
    // 4)создал класс охраны в него добавил интерфейс который подходит под специфику работы охранника
    // следить за порядком впускать запускать в университет демонстриурет принцип разделения
    //интерфейсом
}
