package com.idk07;

/**
 * @Systemname:�ǻ�У԰����ϵͳ
 * @Author:��˳��--202047003111
 * @Description:
 * @Date:Created in 2022/5/29 11:08
 * @Unitname:����ũҵ��ѧ��ϢѧԺ����������ϵ
 * @Copyright:�ۺ�ѵ��ϵͳV1.0
 * @Rewriting:��˳��
 */
public class MyThreadGo {
    public static void main(String[] args) {
        MyThread my1= new MyThread();
        MyThread my2= new MyThread();
        my1.setName("��gie");
        my2.setName("С��");

        my1.start();
        try {
            my1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        my2.start();

        my1.setPriority(9);//�����߳����ȼ�,����ʾ��ȡcpu���ʴ�
        my2.setPriority(8);

        System.out.println(Thread.currentThread().getName());
    }
}
