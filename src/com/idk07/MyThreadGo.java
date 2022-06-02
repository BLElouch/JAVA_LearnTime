package com.idk07;

/**
 * @Systemname:智慧校园管理系统
 * @Author:李顺杰--202047003111
 * @Description:
 * @Date:Created in 2022/5/29 11:08
 * @Unitname:湖南农业大学信息学院物联网工程系
 * @Copyright:综合训练系统V1.0
 * @Rewriting:李顺杰
 */
public class MyThreadGo {
    public static void main(String[] args) {
        MyThread my1= new MyThread();
        MyThread my2= new MyThread();
        my1.setName("飞gie");
        my2.setName("小车");

        my1.start();
        try {
            my1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        my2.start();

        my1.setPriority(9);//设置线程优先级,仅表示获取cpu几率大
        my2.setPriority(8);

        System.out.println(Thread.currentThread().getName());
    }
}
