package com.capgemini.formation.test;

public abstract class MyAbstract {
    int x = 3;
    public MyAbstract() {
        x *= 2;
        System.out.print("-x" + method(3));
    }
    abstract int method();
    abstract int method(int i);
}
