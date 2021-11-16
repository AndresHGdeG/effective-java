package chapter5.generics.item28.preferList;

import java.util.ArrayList;
import java.util.List;

public class WildcardAsReifiable {

    /**
     * The only parameterized types that are reifiable are
     * unbounded wildcard types such as List<?> and Map<?,?>
     * @param args
     */
    public static void main(String[] args) {
        List<?>[] numberList = new List<?>[1];// Valid declaration
        List<Integer> intList =  new ArrayList(){{add(42);}};
        numberList[0] = intList;
        //numberList[0].add(3); invalid
        System.out.println(numberList[0].get(0));
    }
}
