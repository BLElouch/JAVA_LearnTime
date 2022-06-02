package com.idk05;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


/**
 * @Systemname:智慧校园管理系统
 * @Author:李顺杰--202047003111
 * @Description:
 * @Date:Created in 2022/5/23 11:20
 * @Unitname:湖南农业大学信息学院物联网工程系
 * @Copyright:综合训练系统V1.0
 * @Rewriting:李顺杰
 */
public class Listdd {
    public static void main(String[] args) {
        List<String> it=new ArrayList<String>();


        it.add("小林");
        it.add("小王");
        it.add("小x");

        Iterator<String  > itt = it.iterator();
        for(int i=0;i< it.size();i++)
        {
            String s=it.get(i);
            if(s.equals("小王"))
            {
                it.add("mama");
            }
        }
        System.out.println(it);
    }
}
