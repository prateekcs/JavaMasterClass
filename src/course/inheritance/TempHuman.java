package course.inheritance;

public class TempHuman {
    public static void main(String[] args) {


    /*1public static void letsWalk(Human h){
        h.walk();

    }

    public static void main(String[] args) {
        Artists a = new Artists();
        a.name = "Lucia";

        Musician b = new Musician();
        b.name = "Jax";

        letsWalk(a);
        letsWalk(b);*/
        Artists a = new Artists();
        Artists b = new Artists();
        if(a.equals(b)){
            System.out.println("both are equal");
        }else{
            System.out.println("both are not equal");
        }
    }
}
