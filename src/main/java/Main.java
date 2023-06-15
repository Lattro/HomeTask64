import java.util.*;
import java.util.stream.Collectors;

public class Main
{
    public static void main(String[] args)
    {

        //TASK 1
       Set<String> set = new HashSet<String>();
        set.add("Jones");
        set.add("Smith");
        set.add("Tayler");
        set.add("Johnson");
        set.add("James");
        set.add("Davis");
        set.add("Jackson");

        set.stream()
                .filter(x-> x.charAt(0)=='J')
                .forEach(System.out::println);


// TASK 2
       List<String> list = new ArrayList<>();
       list.add("aaa");
       list.add("vvv");
       list.add("aan");
       list.add("eee");
       list.add("bbb");

       list.stream()
               .sorted()
               .forEach(System.out::println);

    }
}
