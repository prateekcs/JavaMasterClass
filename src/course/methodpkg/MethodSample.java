package course.methodpkg;

public class MethodSample {
    public static void main(String[] args) {
        MethodSample obj = new MethodSample();
        obj.sayHello("male");

    }

    public  void sayHello(String gender){
        String newText = gender.equalsIgnoreCase("Male") ? "Hello Sir" : "Hello Madam";//equalIgnore case is used to
        //not take difference b/w upper and lower case letter
        System.out.println(newText);
    }
}
