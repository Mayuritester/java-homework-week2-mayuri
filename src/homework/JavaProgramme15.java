package homework;

/**Write a Java program to swap two variables.

 */
public class JavaProgramme15 {

    public static void main(String[] args) {
        int a = 5;
                int b = 15;
                int temp = a;

        System.out.println("before swapping: a, b = " + a + ","+ b);

        temp = a;
        a = b;
        b = temp;
        System.out.println("after swapping: a, b = " + a +"," + b);
    }

}
