package com.idk07;

/**
 * @Systemname:�ǻ�У԰����ϵͳ
 * @Author:��˳��--202047003111
 * @Description:
 * @Date:Created in 2022/5/29 11:07
 * @Unitname:����ũҵ��ѧ��ϢѧԺ����������ϵ
 * @Copyright:�ۺ�ѵ��ϵͳV1.0
 * @Rewriting:��˳��
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
