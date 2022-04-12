package course.pollymorphism;

public class Cheetah extends WildAnimal{
    public static void main(String[] args) {
        Cheetah c = new Cheetah();
        c.setMinSpeed("80 km/h");
        c.eat();
        c.run();
    }
}
