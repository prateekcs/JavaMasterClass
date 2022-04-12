package course.inheritance;

public class Musician extends Human {

    /*Keyboard myKeyboard = new Keyboard();
    public void playKeyboard(){
        System.out.println(/*name + " is playing keyboard now");
    }
    public void speak(){
        System.out.println(/*name + " will speak calm!");
    }
    public void walk(){
        System.out.println("this is how musician will walk");
    }*/

    public void walk(){
        System.out.println("this is from musician");
    }
    public static void main(String[] args) {
        Musician a = new Musician();
        /*a.name = "Jax";
        a.age = 51;
        a.gender = "male";*/

        /*a.playKeyboard();*/
        a.walk();
        a.speak();

        /*a.myKeyboard.playSound();*/
    }
}
