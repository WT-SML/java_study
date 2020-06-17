package com.sumoli.demo05;

import java.util.Scanner;

public class ApiDemo02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字：");
        int num1 = sc.nextInt();
        System.out.println("请输入第二个数字：");
        int num2 = sc.nextInt();
        System.out.println("它们的和是：" + (num1 + num2));

    }
}
