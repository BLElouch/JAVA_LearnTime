package com.idk02;

/**
 * @Systemname:智慧校园管理系统
 * @Author:李顺杰--202047003111
 * @Description:
 * @Date:Created in 2022/5/22 10:38
 * @Unitname:湖南农业大学信息学院物联网工程系
 * @Copyright:综合训练系统V1.0
 * @Rewriting:李顺杰
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
