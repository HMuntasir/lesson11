package com.company.counter;

public class Counter {
    public static int currentNumber=0;

    public Counter (int a){
        currentNumber=a;
    }
    public static int CurrentNumberplus(){
        int x;
        x=Counter.currentNumber+1;
        return x;
    }
    public static int CurrentNumberminus (){
        int y;
        y=Counter.currentNumber-1;
        if(y<0){return Counter.currentNumber;}
        else {return y;}

    }
    public static int getCurrentNumber (){
        return Counter.currentNumber;
    }

}
