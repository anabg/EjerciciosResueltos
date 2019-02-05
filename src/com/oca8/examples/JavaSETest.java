package com.oca8.examples;

import java.util.ArrayList;
import java.util.List;
public class JavaSETest {
    public static void main(String[] args) {
        List<Integer> elements = new ArrayList<>();
        elements.add(10);
        int firstElmnt = elements.get(1);
        System.out.println(firstElmnt);
        //Exception in thread "main" java.lang.IndexOutOfBoundsException
    }
}
