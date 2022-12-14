package les.home6.les;

import java.util.Scanner;

public class choice {
    public static void main(String[] args){
        Scanner me = new Scanner(System.in);

        System.out.println("Enter a number from 1-7 for desired day:");

        int myDay = me.nextInt();

        switch (myDay) {
            case 1:
                System.out.println("You have selected 1. Day of the week is Monday.");
                break;
            case 2:
                System.out.println("You have selected 2. Day of the week is Thursday.");
                break;
            case 3:
                System.out.println("You have selected 3. Day of the week is Wednesday.");
                break;
            case 4:
                System.out.println("You have selected 4. Day of the week is Thursday.");
                break;
            case 5:
                System.out.println("You have selected 5. Day of the week is Friday.");
                break;
            case 6:
                System.out.println("You have selected 6. Day of the week is Saturday.");
                break;
            case 7:
                System.out.println("You have selected 7. Day of the week is Sunday.");
                break;
            default:
                System.out.println("Your number is not valid. Please choose number from 1 - 7.");

        }

    }
}
