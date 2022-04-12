package course.pollymorphism;

public class Cat extends DomesticAnimal{
    @Override
    public void eat() {
        super.eat();
        System.out.println("i will eat meat as well");
    }
    public void run(boolean hasDanger) {
        if(hasDanger){
            System.out.println("i am running at 48 km/h");
        }else{
            super.run();
        }
        //System.out.println("i am running at " +getMinSpeed());

    }

    public static void main(String[] args) {
        Cat c = new Cat();
        c.setMinSpeed("24 km /h");
        c.eat();
        c.run(false);
    }
}
