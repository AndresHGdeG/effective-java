package chapter5.generics.item28.preferList;

import java.util.ArrayList;
import java.util.List;

public class IlegalGenericArray {

    /**
     * ClassCastException Integer cannot be cast as String
     * @param args
     */
    public static void main(String[] args) {
        List<String>[] stringList = new ArrayList/*<String>*/[1]; // Illegal Generic with array
        List<Integer> intList =  new ArrayList(){{add(42);}};
        Object[] objects = stringList;
        objects[0] = intList;
        String s = /*(String)*/stringList[0].get(0); // cast String add automatically by compiler
        System.out.println("s " + s);
    }
}
