package course.variablepkg;

public class VariableSample {
    //int x;   //instance variable 2
    //boolean x = true; 3
    //String x = "Hello";  4// but string is non primitive
    //int x = 10; 5// value we use is b/w -2147483648 to 2147483648
    // if we increase from it it will generate an error like on 2147483649 long is used for this value
    // for float use
    //float x = 10.527f; 6
    // for double we use like
    //double x = 10.527d; 7// here d is optional but in float it is compulsory to use f
    //type casting
    //float f = 50.21f; 8
    //int x = f;  generate error to use like this bcz explicit type casting is used to this type of
    //int x = (int)f; 8 // output is 50
    //10 byte x = 10;
    //10 byte y = 20;
    //byte z = 10+20;// for now  no need to explicitly type casting bcz for 127 it will generate no error
    //byte z = x+y;// this expression will be evaluated during the run time compiler will not know the value at compile time
    // so it will generate an error so we have to use it explicitly
    // 10byte z = (byte)(x+y);
    // modifiers 1- final 2- public/private/default/protected final 3- static protected final
    // 4- transient static protected final 5- volatile transient static protected
    // final and volatile both are not used together and volatile is used for multithreading
    // 12 final int x; gives error bcz it is mandatory to initialize when you used final variable
    //12 final int x = 10;
    public final int x = 10;

    public static void main(String[] args) {
        //int local;   //local variable 1
        //local = 5; 1
        //System.out.println(local);  1//print 5 only when it is initialized otherwise
        // it will not rum bcz local variable has not any default value
        VariableSample obj = new VariableSample();
        //System.out.println(obj.x);  9// print 0 for integer type variable bcz it has default value 0

        // for boolean it is FALSE
        // for float it is 0.0
        // for byte,short,int,long it is 0
        // for char it is \u0000
        //10 System.out.println(obj.z);
        //11 obj.x = 20; not working bcz final keyword is used in x variable
        System.out.println(obj.x);

    }
}
