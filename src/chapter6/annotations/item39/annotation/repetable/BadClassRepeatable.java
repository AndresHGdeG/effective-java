package chapter6.annotations.item39.annotation.repetable;

import java.util.ArrayList;
import java.util.List;

public class BadClassRepeatable {

    public BadClassRepeatable(){}

    @ExceptionTest(IndexOutOfBoundsException.class)
    @ExceptionTest(NullPointerException.class)
    public static void doublyBad(){
        List<String> list = new ArrayList<>();

        // The spec permits this method to throw either
        // IndexOutOfBoundsException or NullPointerException
        list.addAll(5,null);
    }

}
