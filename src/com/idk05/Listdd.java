package com.idk05;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


/**
 * @Systemname:�ǻ�У԰����ϵͳ
 * @Author:��˳��--202047003111
 * @Description:
 * @Date:Created in 2022/5/23 11:20
 * @Unitname:����ũҵ��ѧ��ϢѧԺ����������ϵ
 * @Copyright:�ۺ�ѵ��ϵͳV1.0
 * @Rewriting:��˳��
 */
public class Listdd {
    public static void main(String[] args) {
        List<String> it=new ArrayList<String>();


        it.add("С��");
        it.add("С��");
        it.add("Сx");

        Iterator<String  > itt = it.iterator();
        for(int i=0;i< it.size();i++)
        {
            String s=it.get(i);
            if(s.equals("С��"))
            {
                it.add("mama");
            }
        }
        System.out.println(it);
    }
}
