package com.idk06;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @Systemname:�ǻ�У԰����ϵͳ
 * @Author:��˳��--202047003111
 * @Description:
 * @Date:Created in 2022/5/23 12:26
 * @Unitname:����ũҵ��ѧ��ϢѧԺ����������ϵ
 * @Copyright:�ۺ�ѵ��ϵͳV1.0
 * @Rewriting:��˳��
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
