package course.collectionpkg;

import course.mypackageB.Persons;

import java.lang.reflect.MalformedParametersException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Vector;

public class ListSample {
    public static void main(String[] args) {
        //vector
        Vector<String> myList = new Vector<>();
        myList.add("a");
        myList.add("b");
        myList.add("c");
        for(String s : myList){
            System.out.println(s);
        }
        //linkedlist
        /*LinkedList<String> myList = new LinkedList<>();
        myList.add("c");
        myList.add("a");
        myList.add("z");
        myList.addFirst("i");
        myList.remove();//remove first element
        //System.out.println(myList.getFirst());
        for(String s : myList){
            System.out.println(s);
        }*/
        //arraylist
        /*3ArrayList<Persons> myList = new ArrayList();
        myList.add(new Persons("Zia",22,"Female"));
        myList.add(new Persons("Alex",21,"Male"));
        myList.add(new Persons("Morgan",23,"Male"));
        Collections.sort(myList);
        for (Persons p : myList){
            System.out.println(p.getName());
        }3*/
        /*ArrayList<String> myList = new ArrayList();
        myList.add("Apple");
        /*2myList.add(new Persons("Alex",55, "Male"));
        System.out.println(((Persons)myList.get(1)).getName());2*/
        /*2myList.add("Orange");
        myList.add("Grape");
        Collections.sort(myList);
        //myList.add(1,"Grape");
        //myList.remove("Apple");
        for(String fruit : myList){
            System.out.println(fruit);
        }2*/
    }
}
