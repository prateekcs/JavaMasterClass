package course.inheritance;

public interface HumanTemp {
    //public void walk();

    default public void speak(){
        System.out.println("Hey, i am from HumanTemp");
    }
}
