package java8.mapandflatemap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SecondHighestSalary {

    public static void main(String[] args) {

        Map<String,Integer> map1 = new HashMap<>();
        map1.put("anil", 1000);
        map1.put("bhavna", 1300);
        map1.put("micael", 1500);
        map1.put("tom", 1600);
        map1.put("ankit", 1200);
        map1.put("daniel", 1700);
        map1.put("james", 1400);


        // find second highest salary

        Map.Entry<String, Integer>  result = map1.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).collect(Collectors.toList()).get(1);
        System.out.println(result);
    }
}
