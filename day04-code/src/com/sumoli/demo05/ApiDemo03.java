package com.sumoli.demo05;

import java.util.Random;
import java.util.Scanner;

/**
 * @author: WuTong
 * @date: 2020/6/17 11:03
 * @description:
 */
public class ApiDemo03 {
    public static void main(String[] args) {
        int ret = new Random().nextInt(100) + 1; //1-100
        System.out.println("欢迎来到猜数字游戏，我已生成一个1-100的数字");
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入一个 1-100 的数字");
            int num = sc.nextInt();
            if (num == ret) {
                System.out.println("恭喜你猜对啦，正确结果就是" + ret + "！");
                break;
            }
            System.out.println(num > ret ? "猜大了" : "猜小了");
        }
    }
}
