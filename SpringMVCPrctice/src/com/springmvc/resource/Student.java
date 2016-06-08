package com.springmvc.resource;

/**
 * Created by MNS on 6/7/2016.
 */
public class Student {

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    private String studentName;

    public String getStudentHobby() {
        return StudentHobby;
    }

    public void setStudentHobby(String studentHobby) {
        StudentHobby = studentHobby;
    }

    private String StudentHobby;
}
