package com.idk08;

/**
 * @Systemname:�ǻ�У԰����ϵͳ
 * @Author:��˳��--202047003111
 * @Description:
 * @Date:Created in 2022/6/2 11:26
 * @Unitname:����ũҵ��ѧ��ϢѧԺ����������ϵ
 * @Copyright:�ۺ�ѵ��ϵͳV1.0
 * @Rewriting:��˳��
 */
public class MyRunable implements Runnable {
    @Override
    public void run() {
        for (int i=0;i<100;i++){
        System.out.println(Thread.currentThread().getName()+":"+i);}
    }
}

