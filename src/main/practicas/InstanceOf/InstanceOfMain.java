package main.practicas.InstanceOf;

import java.io.Serializable;

public class InstanceOfMain {

    public static void printStringLength(Object obj) {
        if (obj instanceof Serializable) {
            System.out.println(obj);
        } else {
            System.out.println("Not serializable");
        }
    }

    public static void addIfIntegers(Object a, Object b) {
        if (a instanceof Integer a1 && b instanceof Integer b1) {
            System.out.println(a1+b1);
        } else {
            System.out.println("Integers weren't provided");
        }
    }

    public static void main(String[] args) {
        printStringLength("Hello");
        printStringLength(1);
        printStringLength(0x123);

        addIfIntegers(12,45);
    }
}
