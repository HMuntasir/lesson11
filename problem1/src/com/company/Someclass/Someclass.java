package com.company.Someclass;

public class Someclass {
    public static int a=4;
    public static int b=5;

    public static void vivod(){
        System.out.println(Someclass.a+"  "+Someclass.b);
    }
    public static int summ(){
        int x=0;
        x=Someclass.a+Someclass.b;
        return x;
    }
    public static int max(){
        if(Someclass.a>Someclass.b){return Someclass.a;}
        else {return Someclass.b;}
    }
}
