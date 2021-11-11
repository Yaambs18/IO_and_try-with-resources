package com.io;

public class OverloadConstructorByThis {
    int a;
    int b;

    // initialize a and b individually
    OverloadConstructorByThis(int i, int j){
        a = i;
        b = j;
    }

    //initialize a and b to the same value
    OverloadConstructorByThis(int i){
        this(i, i);
    }

    // give a and b default values of 0
    OverloadConstructorByThis(){
        this(0);
    }

    public static void main(String[] args) {
        OverloadConstructorByThis obj = new OverloadConstructorByThis(8);
        System.out.println(obj.a);
        System.out.println(obj.b);
    }
}
