package com.sumoli.demo03;

import com.sumoli.demo04.Student;

public class Method {
    public static void main(String[] args) {
        int[] arrayA = {1, 2, 3};
        System.out.println(arrayA[0] + arrayA.length);
        func(5);

        Student ls = new Student("李四", 19);
        ls.sleep();
    }

    public static void func(int count) {
        for (int i = 0; i < count; i++) {
            System.out.println("Hello,World!");
        }
    }
}
