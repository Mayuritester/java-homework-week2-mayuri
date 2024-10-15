package homework;

import java.util.Scanner;

/**Write a Java program to convert a decimal number to binary number.

 Input Data:
 Input a Decimal Number : 5
 Expected Output

 Binary number is: 101
 *
 */
public class JavaProgramme17 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("input decimal number: ");
        int decimal = s.nextInt();

        String binary = Integer.toBinaryString(decimal);
        System.out.println("binary number is: " + binary);




}





}