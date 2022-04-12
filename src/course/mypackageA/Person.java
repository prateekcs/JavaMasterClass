package course.mypackageA;
import course.mypackageB.Persons;  //import course.mypackageB.*;  //


public class Person {
    public static void main(String[] args) {
        Persons alex = new Persons("alex", 55, "Male");// using constructor it force to pass
        // instance variable value while they create an object for your class
        /*alex.name = "Alex";
        alex.age = 55;
        alex.gender = "Male";*/
        alex.sleep();

        Persons mia = new Persons();
        mia.setName("Mia");
        mia.setAge(40);
        mia.setGender("Female");
        mia.sleep();

        Persons james = new Persons();
        james.setName("james");
        james.setAge(3);
        //james.sleep("Male");
        james.sleep();

    }

}
