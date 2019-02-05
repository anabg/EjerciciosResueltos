package com.oca8.examples;

class SuperClass {
    SuperClass(int x) {
        System.out.println("Super");
    }
}

/**
 * A) this(10);
 * B) super(10);
 * C) SuperClass(10);
 * D) super.SuperClass (10);
 */
public class SubClass extends SuperClass {
    SubClass() {
        // Line n1
        super(10);
        System.out.println("Sub 2");
    }
}
//Rta: B