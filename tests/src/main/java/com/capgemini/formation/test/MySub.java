package com.capgemini.formation.test;

public class MySub extends MySuper {
    MySub() {
        x += 3;
        System.out.print("-x" + x);
    }
    int method() {
        return x + 5;
    }
    public static void main(String[] args) {
        MySub sub = new MySub();
    }
}