package com.company.main;

import com.company.someclass.Someclass;

public class Main {

    public static void main(String[] args) {
        Someclass someclass = new Someclass(2,4);
        System.out.println("первое значение = "+someclass.a +"  второе значение = "+someclass.b);
    }
}
