package Day_05.StremApi;

import java.util.List;

public class StreamMethod
{
    public static void main(String[] args)
    {
        /*
        filter(predicate)
        predicate = boolean value function
        e -> e>10
         */
        List<String> names = List.of("kalidas","rahul","naveen","Aman");
        names.stream().filter(e->e.startsWith("A")).forEach(System.out::println);

        /*
        map(function)
        each element operation
         */
        List<Integer> numbers = List.of(7,9,3,4);
        numbers.stream().map(e->e*e).forEach(System.out::println);

        //sort
        numbers.stream().sorted().forEach(System.out::println);
        Integer integer = numbers.stream().min((x,y)-> x.compareTo(y)).get();
        System.out.println("min : "+integer);

        integer = numbers.stream().max((x,y)-> x.compareTo(y)).get();
        System.out.println("max : "+ integer);
    }
}
