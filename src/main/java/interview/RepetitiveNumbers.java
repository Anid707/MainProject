package interview;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RepetitiveNumbers {
    public static void main(String[] args) {
        Integer[] numbers = {1,34,5,67,89,2,34,12,54,75,34,78,0,73,12,56,56,1,-12,43,-12};
        Set<Integer> set = new HashSet<Integer>(Arrays.asList(numbers));

        for (Integer v : set){
            int count = 0;
            for (Integer x : numbers){
                if(v==x){
                    count++;
                }
            }
            if(count>1){
                System.out.println(v+" - "+count+" times");
            }
        }
    }
}
