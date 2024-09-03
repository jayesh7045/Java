package Practise;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;


public class Streams {

    public static void main(String[] args) {
        List<Integer> l1 = Arrays.asList(1);

        l1.stream().filter(new Predicate<Integer>() {
            @Override
            public boolean test(Integer i) {
                System.out.println("Hi there");
                return i % 2 == 0;
            }
        }).map(new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer integer) {
                System.out.println("Hello");
                return integer * integer;
            }
        }).reduce( new BinaryOperator<Integer>(){
            @Override
            public Integer apply(Integer i1, Integer i2)
            {
                System.out.println(i1 + " "+ i2);
                return i1+i2;
            }
        });
                //.reduce(new BinaryOperator<Integer>() {
            //@Override
            //public Integer apply(Integer o, Integer o2) {
              //  return o + o2;
            //}
        //});
        //System.out.println(o);


    }
}
