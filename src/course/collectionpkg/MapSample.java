package course.collectionpkg;

import java.util.*;

public class MapSample {
    public static void main(String[] args) {
        //HashMap<String,String> myMap = new HashMap<>();
        //Hashtable<String,String> myMap = new Hashtable<>();
        //LinkedHashMap<String,String> myMap = new LinkedHashMap<>();
        TreeMap<String,String> myMap = new TreeMap<>();
        myMap.put("CN","China");
        myMap.put("IN","India");
        myMap.put("US","United States");
        myMap.put("UK","United Kingdom");
        myMap.remove("CN");
        System.out.println(myMap.size());
        System.out.println(myMap.get("IN"));
        for (Map.Entry<String,String> map : myMap.entrySet()){
            System.out.println(map.getKey()+ ":" +map.getValue());
        }
    }
}
