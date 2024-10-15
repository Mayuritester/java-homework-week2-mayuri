package homework;

/**
 * 3.1 Declare one instance and one static variable.
 * 3.2 Declare one instance method.
 * 3.3 Declare one static method.
 * 3.4 Call both instance and static variables into both instance and static methods inside the
 * print statement.
 * 3.5 Declare the Main method.
 * 3.6 Call both instance and static methods into the Main method and run the programme.
 */

public class JavaProgramme3 {
    int a = 15;
    static String name = "mayuri";

    public static void main(String[] args) {
        JavaProgramme3 obj = new JavaProgramme3();
        obj.instantMethod();
        staticMethod();
    }

    public void instantMethod() {
        System.out.println(a);
        System.out.println(name);

    }

    public static void staticMethod() {
        JavaProgramme3 obj = new JavaProgramme3();
        System.out.println(obj.a);
        System.out.println(name);

    }
}
