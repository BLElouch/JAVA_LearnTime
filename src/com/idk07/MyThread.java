package com.idk07;

/**
 * @Systemname:智慧校园管理系统
 * @Author:李顺杰--202047003111
 * @Description:
 * @Date:Created in 2022/5/29 11:07
 * @Unitname:湖南农业大学信息学院物联网工程系
 * @Copyright:综合训练系统V1.0
 * @Rewriting:李顺杰
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i=0;i<100;i++)
        {
            System.out.println(getName()+":"+i);
        }
    }
}
