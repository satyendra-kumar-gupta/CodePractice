package java8.mapandflatemap;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Person{
    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    int id;
    String name;
    int age;


}

public class MapAsKayAsIntegerAndValuesAsAObject {

    public static void main(String[] args) {

        List<Person> personStream  = Arrays.asList(new Person(1,"ABC1",10)
                ,new Person(1,"ABC2",20)
                ,new Person(3,"ABC3",30)
                ,new Person(4,"ABC4",40)
                ,new Person(5,"ABC5",50)
                ,new Person(6,"ABC6",60)
        );

        Map<Integer, Person>  mapOfPerson = personStream.stream()
                .collect(Collectors.toMap(Person::getId, Function.identity(),(oldValue, newValue) -> oldValue));


        Map<String, Integer> concurrentHashMap = personStream.stream()
                .collect(Collectors.toMap(Person::getName, Person::getAge, (o1, o2) -> o1, ConcurrentHashMap::new));

        Map<String, Integer> linkedHashMap = personStream.stream()
                .collect(Collectors.toMap(Person::getName, Person::getAge, (o1, o2) -> o1, LinkedHashMap::new));

        Map<String, Integer> treeMap = personStream.stream()
                .collect(Collectors.toMap(Person::getName, Person::getAge, (o1, o2) -> o1, TreeMap::new));



        System.out.println(mapOfPerson);

        System.out.println("===========================================");

        System.out.println(treeMap);
    }
}
