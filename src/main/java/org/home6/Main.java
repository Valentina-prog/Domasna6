package org.home6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner me = new Scanner(System.in);            // class to take input from  user

        System.out.print("Write first number: ");       // printing some text
        int firstNum = me.nextInt();
        System.out.print("Write second number: ");
        int secondNum = me.nextInt();
        System.out.print("Write last number: ");
        int lastNum =me.nextInt();

        int firstTwo = maxTwo(firstNum, secondNum);     // Method is used here

        int bigestNum = maxTwo(firstTwo, lastNum);      // Method is used here


        System.out.println("Biggest number is: " + bigestNum);

    }
    public static int maxTwo( int a, int b ) {           // Method

        if (a > b) {
            return a;
        } else {
            return b;
        }

    }
}