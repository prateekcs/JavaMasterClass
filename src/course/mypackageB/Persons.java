package course.mypackageB;

import course.mypackageA.PersonSuper;

public class Persons extends PersonSuper implements Comparable<Persons>{
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    private String name;
    private String gender;
    private String eyeColor;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int age;


    public Persons(String name, int age, String gender){
        this();
        System.out.println("Person 3 arg constructor");
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public int hashCode() {
        //return super.hashCode();
        return this.name.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        //return super.equals(obj);
        return obj instanceof Persons && this.name.equals(((Persons)obj).name);
    }

    public Persons(){
        //2super("",,"");
        System.out.println("Person Default Constructor");

    }

    public void eat(){
        System.out.println("The way this guy eat");

    }
    public void dance(){
        System.out.println("The way this guy dance");
    }
    public void walk(){
        System.out.println("The way this guy walk");
    }
    public void sleep(){
        if(age<10) {
            System.out.println(name + " will sleep more than 12 hours a day");
        }else if(age>=10 && age<=50){
            System.out.println(name + " will sleep less than 10 hours a day");
        }else{
            System.out.println(name + " will sleep average 10 hours a day");
        }
    }

    @Override
    public int compareTo(Persons o) {
        return name.compareTo(o.name);
    }
}

