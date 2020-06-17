package com.sumoli.demo01;

public class HelloWorld {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                if (i >= j) {
                    System.out.print(j + "x" + i + "=" + i * j + "\t");
                }
            }
            System.out.print("\n");
        }
    }


}
