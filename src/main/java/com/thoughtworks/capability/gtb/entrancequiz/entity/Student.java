package com.thoughtworks.capability.gtb.entrancequiz.entity;

/**
 * @Auto Jiang Yuzhou
 * @Date 2020/9/7 14:37
 * @Description ***
 **/
public class Student {
    private String studentName;

    public Student(String studentName) {
        this.studentName = studentName;
    }

    public Student() { }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    @Override
    public String toString() {
        return studentName;
    }
}
