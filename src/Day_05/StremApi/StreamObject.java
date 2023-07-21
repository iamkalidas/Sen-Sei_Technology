package Day_05.StremApi;

import java.util.*;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObject
{
    public static void main(String[] args)
    {
        //stream API - collection processes
        // collection / group of objects

        //1- blank
        Stream<Object> emptyStream = Stream.empty();
        emptyStream.forEach( e ->
        {
            System.out.println(e);
        });

        //2- Array, object, collection
        String names[] = {"kalidas", "rahul","ankit", "naveen"};
        Stream<String> stream1 = Stream.of(names);
        stream1.forEach( e ->
        {
            System.out.println(e);
        });

        //3- streamBuilder
        Stream<Object> streamBuilder = Stream.builder().build();

        //4- Array, object, collection
        IntStream stream4 = Arrays.stream(new int[]{2,6,3,7,9});
        stream4.forEach( e ->
        {
            System.out.println(e);
        });

        //5. list, set
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        Stream<Integer> stream5 = list.stream();
        stream5.forEach( e ->
        {
            System.out.println(e);
        });
    }
}
