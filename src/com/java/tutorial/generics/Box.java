package com.java.tutorial.generics;

/**
 * Generic version of the Box class
 * @param <T> the type of the value being boxed
 */
public class Box<T> {

    //T stands for "Type"
    private T t;

    public void setT(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }



    public static void main(String[] args ){
        Box<Integer> integerBox = new Box<>();

        integerBox.setT(new Integer(1));
        System.out.println(integerBox.getT());
    }
}


