package com.idk04;

/**
 * @Systemname:�ǻ�У԰����ϵͳ
 * @Author:��˳��--202047003111
 * @Description:
 * @Date:Created in 2022/5/23 9:46
 * @Unitname:����ũҵ��ѧ��ϢѧԺ����������ϵ
 * @Copyright:�ۺ�ѵ��ϵͳV1.0
 * @Rewriting:��˳��
 */
public class Timemachine {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        for (int i = 0; i <= 10000; i++) {
            System.out.println(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("����ʱ" + (end - start) + "����");
    }
}
