package chapter5.generics.item28.preferList;

import java.util.ArrayList;
import java.util.List;

public class InvariantVsCovariant {

    public static void main(String[] args) {
        covariant();
        invariant();
    }

    /**
     * By definition arrays are covariant due to a
     * String[] is a subtype of Object[]
     */
    private static void covariant(){
        Object[] objectArray = new Long[1];
        objectArray[0] = "hello";
        System.out.println("object: " + objectArray[0]); // An error is thrown at runtime
    }

    /**
     * By definition Generics are invariant due to
     * List<String> is not a subtype of List<Object>
     */
    private static void invariant(){
        List<Long> ol = new ArrayList<>();
        //ol.add("Hello"); // erro is throw by compiler
    }

}
