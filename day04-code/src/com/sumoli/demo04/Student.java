package com.sumoli.demo04;

public class Student {
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    String name;
    int age;

    public void eat() {
        System.out.println(this.name + "正在吃饭");
    }

    public void sleep() {
        System.out.println(this.name + "正在睡觉");
    }

    public void study() {
        System.out.println(this.name + "正在学习");
    }
}
