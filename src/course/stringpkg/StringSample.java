package course.stringpkg;

public class StringSample {
    public static void main(String[] args) {
        //String s1 = new String("Welcome");
        //String s2 = new String("Welcome");//not same
        StringBuffer s1 = new StringBuffer("Welcome to Java");//StringBuilder also use
        s1.append("!!!");//delete(str i,end i),insert(),toString
        /*String s2 = "welcome";//same
        if(s1.equalsIgnoreCase(s2)){
            System.out.println("both references are pointing same objects");
        }else{
            System.out.println("both references are pointing diif objects");
        }
        /*s1 = s1.concat(("Java"));*/
        /*System.out.println(s1.concat("!!!!"));//or s1 + "!!!!"
        System.out.println(s1.replace(" ","-"));
        System.out.println(s1.substring(1,3));
        System.out.println(s1.trim());*/
        System.out.println(s1);

    }

}
