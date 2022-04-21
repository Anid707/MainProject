package lesson13;

import java.util.ArrayList;
import java.util.List;

public class App2 {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        String[] colors1 = {"Red","Green","Blue"};

        System.out.println(colors.size());
        colors.add("Red");
        colors.add("Green");
        colors.add("Grey");
        colors.add("Red");
        colors.add("Blue");

        System.out.println(colors.size());
        System.out.println(colors);

        colors.add("Pink");
        System.out.println(colors.size());
        System.out.println(colors);

        colors.add(1,"Yellow");
        System.out.println(colors);
        System.out.println(colors.get(3));
        /*String oldElement = */colors.set(5,"Cyan");
//        System.out.println(oldElement);
        System.out.println(colors);

        colors.remove("Red");
        System.out.println(colors);
        System.out.println(colors.contains("Yelloww"));

        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);

        Person p1 = new Person("Anna");
        Person p2 = new Person("David");
        List<Person>personList = new ArrayList<>();
        personList.add(p2);
        personList.add(p1);
        personList.add(new Person("Steve"));

        System.out.println(personList.get(2).getName());
        System.out.println(personList);

//        for (int i=0;i<colors.size();i++){
//            System.out.println(colors.get(i));
//        }

//        for (Person p : personList){
//            System.out.println(p.getName());
//        }

        colors.forEach(color-> System.out.println(color));
//        colors.forEach(System.out::println);


    }
}
