package java8.mapandflatemap;

import java.util.Arrays;
import java.util.Collection;
import java.util.Random;
import java.util.random.RandomGenerator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Stream.builder;

public class StreamAPIExample {

    public static void main(String[] args) {
        // Stream Creation
        // Empty Stream

        Stream<String> stream = Stream.empty();
        System.out.println(stream);

        // Stream of Collection
        Collection<String> stringCollection = Arrays.asList("a","b","c");
        System.out.println(stringCollection);

        Stream<String>  stringStream = stringCollection.stream();
        System.out.println(stringStream.collect(Collectors.toList()));

        // Stream of Array

        Stream<String> streamOfArrays = Stream.of("a","b","c");
        System.out.println(streamOfArrays.collect(Collectors.toList()));

        //We can also create a stream out of an existing array or of part of an array:
        String[] arr = new String[]{"a", "b", "c"};
        Stream<String> streamOfArrayFull = Arrays.stream(arr);
        Stream<String> streamOfArrayPart = Arrays.stream(arr, 1, 3);
        System.out.println(streamOfArrayPart.collect(Collectors.toList()));

        // 2.4. Stream.builder()
        Stream<String> streamBuilder = Stream.
                <String>builder().add("a").add("b").add("c").add("d").build();
        System.out.println(streamBuilder.collect(Collectors.toList()));

        // Stream.generate()
        Stream<String> streamGenerated = Stream
                .generate(()->"Elements").limit(10);
        System.out.println(streamGenerated.collect(Collectors.toList()));

        // Randon number
        Stream<Long> streamGeneratedNum = Stream
                .generate(()-> (long) Math.floor((Math.random() * (9*Math.pow(10,10-1))) + Math.pow(10,(2-1)))).limit(10);
        System.out.println(streamGeneratedNum.collect(Collectors.toList()));



    }
}
