package homework;

import java.util.Scanner;

/**Write a Java program that takes three numbers as input to calculate and
 print the average of the numbers.
 */
public class JavaProgramme13 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Input the first number  ");
        double x = in.nextDouble();
        System.out.println("Input the second number  ");
        double y = in.nextDouble();
        System.out.println("Input the third number  ");
        double z = in.nextDouble();
        System.out.println("The average value is " + average(x, y, z) + "\n");

    }

    public static double average(double x, double y, double z){

        return (x + y + z) / 3;

    }


        }


