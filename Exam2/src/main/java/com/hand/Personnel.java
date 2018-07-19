package com.hand;

/**
 * @program: JavaTest1
 * @description: 人员
 * @author: lichao
 * @create: 2018-07-19 09:45
 **/

public class Personnel {
    private String name;
    private int salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Personnel(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
}
