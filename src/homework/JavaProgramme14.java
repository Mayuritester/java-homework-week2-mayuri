package homework;

import java.util.Scanner;

/**14. Write a Java program to print the area and perimeter of a rectangle.
 Test Data:
 Width = 5.6 Height = 8.5
 Expected Output:
 Area is 5.6 * 8.5 = 47.60
 Perimeter is 2 * (5.6 + 8.5) = 28.20
 */
public class JavaProgramme14 {
    public static void main(String[] args) {
        double w, h, area, perimeter;
        Scanner s = new Scanner (System.in);
        System.out.println("Enter width of rectangle: ");
        w = s.nextDouble();
        System.out.println("Enter height of rectangle: ");
        h = s.nextDouble();
        area = w * h;
        System.out.println("area of rectangle: " +area);
        perimeter = 2 * (w + h);
        System.out.println("perimeter of rectangle: " +perimeter );








    }

}
