package homework;

import java.util.Scanner;

/**16. Write a Java program to add two binary numbers.

 Input Data:
 Input first binary number: 10
 Input second binary number: 11

 */
public class JavaProgramme16 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("input first binary number: ");
        String binary1 = s.nextLine();

        System.out.println("input second binary number: ");
        String binary2 = s.nextLine();

        int number1 = Integer.parseInt(binary1,2);
        int number2 = Integer.parseInt(binary2,2);

        int sum = number1 + number2;
        String binarySum = Integer.toBinaryString(sum);

        System.out.println("sum of two binary numbers:  "+ binarySum);


    }
}
