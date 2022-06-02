package com.idk05;
/**
 * @Systemname:�ǻ�У԰����ϵͳ
 * @Author:��˳��--202047003111
 * @Description:
 * @Date:Created in 2022/5/22 9:54
 * @Unitname:����ũҵ��ѧ��ϢѧԺ����������ϵ
 * @Copyright:�ۺ�ѵ��ϵͳV1.0
 * @Rewriting:��˳��
 */

public class Student {
    private String name;
    private int age;
    public Student()
    {}
    public Student(int age, String name)
    {
        this.age=age;
        this.name=name;
    }

    public String getName(String name)
    {
        return this.name;
    }

    public int getAge(int age)
    {
        return this.age;
    }

    public void setName(String name)
    {
        this.name=name;
    }

    public void setAge(int age)
    {
        this.age=age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (age != student.age) return false;
        return name != null ? name.equals(student.name) : student.name == null;
    }


}
