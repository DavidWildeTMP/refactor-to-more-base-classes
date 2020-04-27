package com.github.hcsp.inheritance;

public class People {
    private String name;
    private int age;

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void sayMyName() {
        System.out.println("我的名字是" + name);
    }
    public void sayMyAge() {
        System.out.println("我的年龄是" + age);
    }


}