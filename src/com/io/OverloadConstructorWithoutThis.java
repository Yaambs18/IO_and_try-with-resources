package com.io;

public class OverloadConstructorWithoutThis {
    int a;
    int b;

    OverloadConstructorWithoutThis(int i, int j){
        a = i;
        b = j;
    }
    OverloadConstructorWithoutThis(int i){
        a = i;
        b = i;
    }
    OverloadConstructorWithoutThis(){
        a = 0;
        b = 0;
    }

    public static void main(String[] args) {
        OverloadConstructorWithoutThis obj1 = new OverloadConstructorWithoutThis(8);

        OverloadConstructorWithoutThis obj3 = new OverloadConstructorWithoutThis();

        OverloadConstructorWithoutThis obj2 = new OverloadConstructorWithoutThis(1,2);

        System.out.println(obj1.a);
        System.out.println(obj1.b);

        System.out.println(obj2.a);
        System.out.println(obj2.b);

        System.out.println(obj3.b);
    }

}
