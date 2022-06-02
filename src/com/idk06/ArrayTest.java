package com.idk06;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @Systemname:智慧校园管理系统
 * @Author:李顺杰--202047003111
 * @Description:
 * @Date:Created in 2022/5/23 12:26
 * @Unitname:湖南农业大学信息学院物联网工程系
 * @Copyright:综合训练系统V1.0
 * @Rewriting:李顺杰
 */
public class ArrayTest {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<String>();
        list1.add("1");
        list1.add("2");

        List<String> list2 = new LinkedList<String>();
        list2.add("k");
        list2.add("m");


        for (String s : list1) {
            System.out.println(s);
        }
        for (String s : list2) {
            System.out.println(s);
        }
    }
}
