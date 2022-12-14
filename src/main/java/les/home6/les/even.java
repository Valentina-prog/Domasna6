package les.home6.les;

import java.util.Scanner;

public class even {

    public static void main(String[] args) {
        Scanner me = new Scanner(System.in);

        System.out.print("Enter a number: ");

        int number = me.nextInt();

        if(number % 2 == 0)
            System.out.println("Number " + number + " is even.");

        else
            System.out.println("Number " + number + " is odd.");
    }
}
