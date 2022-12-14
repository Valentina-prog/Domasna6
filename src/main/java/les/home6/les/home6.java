package les.home6.les;

import java.util.Scanner;

public class home6 {

    public static void main(String[] args) {

        int high = 6;
        int width = 10;

        System.out.println("High of the rectangle is: 6 cm.");
        System.out.println("Width of rectangle is: 10 cm. ");

        int perimeter = 2 * (width + high);
        int area = width * high;

        System.out.println("Perimeter of the rectangle is: " + perimeter + "cm.");
        System.out.println("Area of the rectangle is: " + area + " square cm.");

    }
}
