package course.inheritance;

public class Artists extends Human{
    /*public void speak(){
        HumanTemp.super.speak();
    }*/

    public void walk(){
        System.out.println("this is from artist");
    }
    /*public void speak(){
        System.out.println("this is how artist will speak");
    }*/

    /*public void preparePainting(){
        System.out.println(/*name + " this is preparing for painting");
*/




    public static void main(String[] args) {
        /*//Human a = new Artists();
        //Human a = new Human();
        Artists a = new Artists();
        /*a.name = "Lucia";
        a.age = 23;
        a.gender = "female";*/
        /*a.preparePainting();
        a.speak();
        */
        Artists a = new Artists();
        a.walk();
        a.speak();
    }
}
