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
public class ManyThraed {
    public static void main(String[] args) {
        MyRunable my= new MyRunable();

        Thread t1= new Thread(my,"��gie");
        Thread t2= new Thread(my,"С��");

        t1.start();
        t2.start();


        System.out.println(Thread.currentThread().getName());
    }
}
