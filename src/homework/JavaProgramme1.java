package homework;
/**1.1 Declare two instance variables.
 * 1.2 Declare one instance method.
 *1.3 Call both instance variables into the instance method inside the print statement.
 *1.4 Declare the Main method.
 *1.5 Call the above instance method into the Main method and Run the programme.
 */


public class JavaProgramme1 {
    int a = 15;
    String name = "Mayuri";


    public static void main(String[] args) {
        JavaProgramme1 obj = new JavaProgramme1();
        obj.m1();

    }

    public void m1() {
        System.out.println(a);
        System.out.println(name);


    }


}
