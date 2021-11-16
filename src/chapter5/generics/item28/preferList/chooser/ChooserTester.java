package chapter5.generics.item28.preferList.chooser;

import java.util.List;

public class ChooserTester {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4);
        System.out.println("Object: " + new ObjectChooser(numbers).choose());
        System.out.println("E[]: " + new GenericChooser(numbers).choose());
        System.out.println("List<E>: " + new ChooserList(numbers).choose());
    }
}
