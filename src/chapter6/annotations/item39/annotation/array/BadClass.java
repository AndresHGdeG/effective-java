package chapter6.annotations.item39.annotation.array;

import java.util.ArrayList;
import java.util.List;

public class BadClass {

    public BadClass(){}

    @ExceptionTest({IndexOutOfBoundsException.class, NullPointerException.class})
    public static void doublyBad(){
        List<String> list = new ArrayList<>();

        // The spec permits this method to throw either
        // IndexOutOfBoundsException or NullPointerException
        list.addAll(5,null);
    }

}
