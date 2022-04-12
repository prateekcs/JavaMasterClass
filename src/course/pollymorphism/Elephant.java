package course.pollymorphism;

public class Elephant extends WildAnimal{
    @Override
    public void eat() {
        System.out.println("i will eat fruits");
    }

    public static void main(String[] args) {
        Elephant e = new Elephant();
        e.setMinSpeed("20 km/h");
        e.eat();
        e.run();
    }
}
