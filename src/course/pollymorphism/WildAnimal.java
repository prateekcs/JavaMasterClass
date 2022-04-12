package course.pollymorphism;

public class WildAnimal extends Animal{
    @Override
    public void eat() {
        System.out.println("i will eat meat");
    }

    @Override
    public void run() {
        System.out.println("i am running at "+getMinSpeed());

    }
}
