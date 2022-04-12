package course.pollymorphism;

public class DomesticAnimal extends Animal{
    @Override
    public void eat() {
        System.out.println("i will eat milk");
    }

    @Override
    public void run() {
        System.out.println("i am running at " +getMinSpeed());

    }
}
