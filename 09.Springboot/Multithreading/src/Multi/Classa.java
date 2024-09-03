package Multi;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Classa {
    public static void main(String[] args) {
        System.out.println("Hello");
        int sum = 0;
        Arrays Array;
        List<Integer> num = Arrays.asList(2, 4, 5, 7, 6, 8);
        for(int i  = 0; i < num.size(); i++)
        {
            if(num.get(i) % 2 == 0)
            {
                sum += num.get(i)*num.get(i);
            }
        }
        System.out.println(sum);
        Stream<Integer> o = num.stream().filter(new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer%2 == 0;
            }
        }).map(new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer integer)
            {
                System.out.println("I am inside the apply method");
                return integer*integer;
            }
        });
        Optional<Integer> x = o.reduce(new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer, Integer integer2) {
                System.out.println("The first integer is "+integer);
                System.out.println("The second integer is "+integer2);
                return integer+integer2;
            }

        });
        /*
        1. Always note that we can apply as many numbers of intermidiate operations on streams as much we want
        2. But once we have used the termincal operation on the streams then we can not apply any intermidiate operation on it
        3. If we want to collect the list of items we can use collect(Collectors.toList()); as our terminal expression
        4. Once we have applied any terminal operation on the Stream<Integer> then  we can not apply function related to the
            Stream on it because after applying the terminal operation our datatype is Optional<Integer>.
            So we can apply the functions that are compatible to be applied on the Optional<Integer> only and not on Streams<Integer>
        5. Terminal op won't give us string
        6. On one stream of data we can apply the terminal op only once

        */
/*
        System.out.println(x);
*/

        List<Integer> l1 = num.stream().filter(new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer%2 == 0;
            }
        }).map(new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer*integer;
            }
        }).collect(Collectors.toList());



        System.out.println(l1);


        int ans = num.stream().filter(integer -> integer%2 == 0).map(integer-> integer*integer).reduce(0, (integer, integer2) -> integer+integer2);
        System.out.println(ans);
    }
}
