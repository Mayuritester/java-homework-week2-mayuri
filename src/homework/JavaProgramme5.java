package homework;

import java.util.Scanner;

/**
 * 5. Write a program for a calculator with addition, subtraction, multiplication
 * and division methods all with parameters and use string concatenation
 * methods.(Note: Two static and Two instance methods.)
 */
public class JavaProgramme5 {

    public void addition(int a, int b) {
        int ans = a + b;
        System.out.println("addition of two number " + a + " and " + b + " is " + ans);
    }

    public void subtraction(int a, int b) {
        int ans = a - b;
        System.out.println("subtraction of two number " + a + " and " + b + " is " + ans);

    }

    public static void multiplication(int a, int b) {
        int ans = a * b;
        System.out.println("multiplication of two number " + a + " and " + b + " is " + ans);

    }

    public static void division(int a, int b) {
        int ans = a / b;
        System.out.println("division of two number " + a + " and " + b + " is " + ans);


    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        JavaProgramme5 obj = new JavaProgramme5();
        System.out.println("Enter first number of addition");
        int a = scanner.nextInt();
        System.out.println("Enter second number of addition");
        int b = scanner.nextInt();
        obj.addition(a, b);

        System.out.println("Enter first number of subtraction");
        int c = scanner.nextInt();
        System.out.println("Enter second number of subtraction");
        int d = scanner.nextInt();
        obj.subtraction(c, d);

        System.out.println("Enter first number of multiplication");
        int e = scanner.nextInt();
        System.out.println("Enter second number of multiplication");
        int f = scanner.nextInt();
        obj.multiplication(e, f);

        System.out.println("Enter first number of division");
        int g = scanner.nextInt();
        System.out.println("Enter second number of division");
        int h = scanner.nextInt();
        obj.division(g, h);

    }


}



