package homework;

import java.util.Scanner;

/**
 *Write a program to calculate the area of a triangle.

 */
public class JavaProgramme8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Entre the base of the Triangle");
        int b = scanner.nextInt();

        System.out.println("Entre the base of the Triangle");
        int h = scanner.nextInt();

        scanner.close();

        int area = (b * h) / 2;
        System.out.println("The area of the trianle is: " +area);



    }



}
