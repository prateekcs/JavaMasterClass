package course.collectionpkg;

import course.mypackageB.Persons;

import java.util.TreeSet;

public class SetSample {
    public static void main(String[] args) {
        /*2HashSet<String> mySet = new HashSet<>();
        mySet.add("Apple");
        mySet.add("Orange");
        mySet.add("Grape");
        mySet.add("Orange");
        mySet.add("Grape");
        //for(String fruit : mySet){
            //System.out.println(fruit);
        //}
        HashSet<String> newSet = new HashSet<>(mySet);
        newSet.add("Watermelon");
        for(String fruit : newSet) {


            System.out.println(fruit);
        }*/
        /*3LinkedHashSet<String> mySet = new LinkedHashSet<>();
        mySet.add("Apple");
        mySet.add("Orange");
        mySet.add("Grape");
        //mySet.add("Orange");
        //mySet.add("Grape");
        for(String fruit : mySet){
        System.out.println(fruit);
        }3*/
        // tree sorted
        TreeSet<Persons> mySet = new TreeSet<>();
        /*mySet.add("Apple");
        mySet.add("Orange");
        mySet.add("Grape");*/
        mySet.add(new Persons("Zia",22,"Female"));
        mySet.add(new Persons("Alex",21,"Male"));
        mySet.add(new Persons("Morgan",23,"Male"));
        //mySet.add("Orange");
        //mySet.add("Grape");
        for (Persons p : mySet){
            System.out.println(p.getName());
        }

    }
}
