package com.homework;

public class Parent {

    private String parentName;
    private String parentBirthday;


    public Parent(String parentName, String parentType) {
        this.parentName  = parentName;
        this.parentType = parentType;
    }


    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public String getParentBirthday() {
        return parentBirthday;
    }

    public void setParentBirthday(String parentBirthday) {
        this.parentBirthday = parentBirthday;
    }


@Override
    public String toString() {
        return this.getParentName() + " " + this.getParentBirthday();
    }
}
