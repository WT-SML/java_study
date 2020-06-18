package com.sumoli.demo07;

import java.util.ArrayList;

/**
 * @author: wutong
 * @date: 2020/6/17 13:59
 * @description:
 */
public class DemoArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        // 常用方法
        // add,get,remove,size
        list.add("张三");
        list.add("李四");
        list.add("王五");
        System.out.println(list);
        System.out.println(list.get(1));
        System.out.println(list.size());
        list.remove(2);
        System.out.println(list);
        list.remove("张三");
        System.out.println(list);

        // 遍历
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("古力娜扎");
        list2.add("马尔扎哈");
        list2.add("迪丽热巴");
        for (String s : list2) {
            System.out.println(s);
        }
    }
}
