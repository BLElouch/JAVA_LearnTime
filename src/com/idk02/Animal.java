package com.idk02;

/**
 * @Systemname:�ǻ�У԰����ϵͳ
 * @Author:��˳��--202047003111
 * @Description:
 * @Date:Created in 2022/5/22 10:38
 * @Unitname:����ũҵ��ѧ��ϢѧԺ����������ϵ
 * @Copyright:�ۺ�ѵ��ϵͳV1.0
 * @Rewriting:��˳��
 */
public class Animal {
    private int age;
    private String name;

    public Animal(){};
    public Animal(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name)
    {
        this.name=name;
    }

    public int getAge() {
        return age;
    }
    public  String getName()
    {
        return name;
    }
}
