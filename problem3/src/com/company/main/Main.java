package com.company.main;

import com.company.counter.Counter;

public class Main {

    public static void main(String[] args) {
        Counter counter = new Counter(5);

        System.out.println("Значение + 1 = "+counter.CurrentNumberplus());
        System.out.println("Значение - 1 = "+counter.CurrentNumberminus());
        System.out.println("Текущее значение = "+counter.getCurrentNumber());
    }
}
