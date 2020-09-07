package com.thoughtworks.capability.gtb.entrancequiz.entity;

/**
 * @Auto Jiang Yuzhou
 * @Date 2020/9/7 14:37
 * @Description ***
 **/
public class Student {

    private Integer id;
    private String studentName;

    public Student(Integer id, String studentName) {
        this.id = id;
        this.studentName = studentName;
    }

    public Student() { }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return id + "." + studentName;
    }
}
