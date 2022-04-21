package lesson14;

import java.util.HashSet;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        Set<String> colors = new HashSet<String>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        System.out.println(colors);
        colors.add("Blue");
        System.out.println(colors);

        System.out.println(colors.contains("Red"));

        for (String color: colors){
            System.out.println(color);
        }
    }
}
