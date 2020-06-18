package com.sumoli.demo07;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author: wutong
 * @date: 2020/6/17 14:37
 * @description:
 */
public class DemoArrayListRandom {
    /**
     * 题目：产生 6 个1-33的随机数，放到集合中，并且遍历集合
     */
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            list.add(new Random().nextInt(33) + 1);
        }
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
}
