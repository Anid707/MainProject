package lesson14;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class App1 {
    public static void main(String[] args) {
        Map<String,String> capitals = new HashMap<>();
        capitals.put("Argentina","Buenos Aires");
        capitals.put("Germany","Berlin");
        capitals.put("India","New Delhi");
        capitals.put("South Africa","Pretoria");
        System.out.println(capitals);
        capitals.put("Germany","Bonn");
        System.out.println(capitals);
        capitals.put("Great Britain","London");
        capitals.put("England","London");
        System.out.println(capitals);
        System.out.println(capitals.get("England"));
        System.out.println(capitals.get("Germany"));
        System.out.println(capitals.get("Great Britain"));

        Map<Integer,String> colors = new HashMap<>();
        colors.put(0,"Red");
        colors.put(1,"Green");
        colors.put(2,"Red");
        colors.put(3,"Blue");
        System.out.println(colors);

        System.out.println(colors.get(1));

//        Set<String> countries = capitals.keySet();
//        for (String country: countries){
//            System.out.println(country);
//        }
//        for (String country: capitals.keySet()){
//            System.out.println(country);
//        }

//        Collection<String> cities = capitals.values();
//        for (String city : cities){
//            System.out.println(city);
//        }
//        for (String city: capitals.values()){
//            System.out.println(city);
//        }

//        for (Map.Entry<String,String> pair : capitals.entrySet()){
//            System.out.println(pair.getKey()+" "+pair.getValue());
//        }

        capitals.replace("Germany","Berlin");
        System.out.println(capitals);

        capitals.remove("India");
        System.out.println(capitals);
    }
}
