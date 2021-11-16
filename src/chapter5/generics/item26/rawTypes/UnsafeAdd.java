package chapter5.generics.item26.rawTypes;

import java.util.ArrayList;
import java.util.List;

public class UnsafeAdd {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        unsafeAdd(strings, Integer.valueOf(42));
        String s = strings.get(0);// Has compile-generated cast
        System.out.println("s " + s);
    }

    private static void unsafeAdd(List list, Object o){
        list.add(o);
    }
}
