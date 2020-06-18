package com.sumoli.demo06;

/**
 * @author: wutong
 * @date: 2020/6/17 13:35
 * @description:
 */
public class ObjArr {
    public static void main(String[] args) {
        Person p1 = new Person("张三", 18);
        Person p2 = new Person("李四", 19);
        Person p3 = new Person("王五", 20);
        Person[] arrPerson = {p1, p2, p3};
        System.out.println(arrPerson[0].getName());
    }
}
