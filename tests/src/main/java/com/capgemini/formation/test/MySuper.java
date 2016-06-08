package com.capgemini.formation.test;

public class MySuper extends MyAbstract {
    int x = 2;

    public MySuper() {
        System.out.print("-x" + method());
    }

    int method() {
        x++;
        return (x * 5 + super.x);
    }

    int method(int i) {
        return (method() + i);
    }
}