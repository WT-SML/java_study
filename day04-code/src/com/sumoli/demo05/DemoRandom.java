package com.sumoli.demo05;

import java.util.Random;

/**
 * @author: WuTong
 * @date: 2020/6/17 11:44
 * @description:
 */
public class DemoRandom {
    public static void main(String[] args) {
        Random r = new Random();
        int num = r.nextInt(100);
        System.out.println(num);
    }
}
