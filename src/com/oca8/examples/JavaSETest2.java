package com.oca8.examples;

public class JavaSETest2 {

    public static void main(String[] args){

        int cardVal = 18;
                //6. 10. 14. 18
        // Line n1
        switch (cardVal) {
            case 4: case 5: case 6:
            case 7: case 8:
                System.out.println("Hit");
                break;
            case 9: case 10: case 11:
                System.out.println("Double");
                break;
            case 15: case 16:
                System.out.println("Surrender");
                break;
            default:
                System.out.println("Stand");
        }
    }

    //rta: 14 - 18
}
