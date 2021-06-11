package com.example.student.entity;

/**
 * @Author baoguangyu
 * @Date 2021/6/11 13:34
 * @Version 1.0
 */
public class Student {

    private int id;
    private String realName;
    private int age;

    public Student(int id, String realName, int age) {
        this.id = id;
        this.realName = realName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", realName='" + realName + '\'' +
                ", age=" + age +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
