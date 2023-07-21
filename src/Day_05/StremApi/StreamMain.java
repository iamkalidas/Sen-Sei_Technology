package Day_05.StremApi;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain
{
    public static void main(String[] args)
    {
        //create a list and filter all even numbers from list
        List<Integer> list1 = List.of(2, 4, 50, 21, 22, 56);

        List<Integer> list2 = new ArrayList<>();
        list2.add(10);
        list2.add(20);
        list2.add(30);
        list2.add(40);

        List<Integer> list3 = Arrays.asList(3, 2, 5, 2, 6, 7, 8);

        //list1 without stream
        List<Integer> listEven = new ArrayList<>();
        for (Integer i:list1)
        {
            if (i % 2 == 0)
            {
                listEven.add(i);
            }
        }
        System.out.println(listEven);

        //using stream api
        /*
        Stream<Integer> stream = list1.stream();
        List<Integer> newList = stream.filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(newList);
         */
        List<Integer> newList1 = list1.stream().filter(i -> i % 2 == 0).toList();
        System.out.println(newList1);

        List<Integer> newList2 = list1.stream().filter(i -> i > 50).collect(Collectors.toList());
        System.out.println(newList2);


    }
}
