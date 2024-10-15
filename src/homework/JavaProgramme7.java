package homework;

import java.util.Scanner;

/**
 * Write a program to insert any temperature value in degree Fahrenheit and
 * convert to degree Celsius ((F − 32) × 5/9 = 0°C).
 */
public class JavaProgramme7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Insert any temperature value in degree Fahrenheit to convert into celsius");
        double Fahrenheit = scanner.nextDouble();

        double cel = ((Fahrenheit - 32) * 5/9);
        System.out.println("Celsius temperature is" +cel);






    }

}
