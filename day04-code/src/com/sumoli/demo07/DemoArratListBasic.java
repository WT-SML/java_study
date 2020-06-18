package com.sumoli.demo07;

import java.util.ArrayList;

/**
 * @author: wutong
 * @date: 2020/6/17 14:18
 * @description:
 */
public class DemoArratListBasic {
    /**
     * 泛型不能接收基本类型
     * 向ArrayList中存储基本类型
     * 使用基本类型的包装类
     * 基本类型         包装类（引用类型，都位于java.lang包下）
     * byte             Byte
     * short            Short
     * int              Integer
     * long             Long
     * float            Float
     * double           Double
     * char             Character
     * boolean          Boolean
     */
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        System.out.println(list);
    }

}
