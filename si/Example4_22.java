package com.si;

import com.san.T2;
public class Example4_22 {
    public static void main(String[] args) {
        Circle3 circle=new Circle3(10);
        Circular3 circular=new Circular3(circle,20);
        System.out.println("圆锥的面积是："+circular.getVolme());
        T2 d2=new T2();
        d2.print();
    }
}
