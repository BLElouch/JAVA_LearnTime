package com.idk08;

/**
 * @Systemname:智慧校园管理系统
 * @Author:李顺杰--202047003111
 * @Description:
 * @Date:Created in 2022/6/2 11:26
 * @Unitname:湖南农业大学信息学院物联网工程系
 * @Copyright:综合训练系统V1.0
 * @Rewriting:李顺杰
 */
public class ManyThraed {
    public static void main(String[] args) {
        MyRunable my= new MyRunable();

        Thread t1= new Thread(my,"飞gie");
        Thread t2= new Thread(my,"小车");

        t1.start();
        t2.start();


        System.out.println(Thread.currentThread().getName());
    }
}
