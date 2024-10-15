package homework;

/**4.1 Declare two instance and two static variables.
 *4.2 Declare one instance method.
 *4.3 Declare one static method.
 *4.4 Call all four instance and static variables into both instance and static methods inside the
  print statement.
 *4.5 Declare the Main method.
 *4.6 Call both instance and static methods into the Main method and run the programme.
 */
public class JavaProgramme4 {
 int a = 16;
 int b = 20;
 static String name = "mayuri";
 static String lastname ="gohil";

    public static void main(String[] args) {
        JavaProgramme4 obj = new JavaProgramme4();
        obj.instanceMethod();
        staticMethod();
    }

 public void instanceMethod(){
     System.out.println(a);
     System.out.println(b);
     System.out.println(name);
     System.out.println(lastname);
 }
 public static void staticMethod(){
    JavaProgramme4 obj = new JavaProgramme4();
     System.out.println(obj.a);
     System.out.println(obj.b);
     System.out.println(name);
     System.out.println(lastname);

 }
}
