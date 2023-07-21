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
        List<Integer> numbers = List.of(1,2,3,4);
        numbers.stream().map(e->e*e).forEach(System.out::println);

    }
}
