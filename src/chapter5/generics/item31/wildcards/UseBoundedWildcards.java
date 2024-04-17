package chapter5.generics.item31.wildcards;

import java.util.List;

public class UseBoundedWildcards {

    public static void main(String[] args) {
        UseBoundedWildcards.simpleTest();
        UseBoundedWildcards.pushAllTest();
    }

    public static void simpleTest(){
        System.out.println("--------Simple test--------");
        MyStack<Number> myStack = new MyStack<Number>();
        myStack.push(42);
        myStack.push(55);
        myStack.push(65);
        myStack.printAll();

    }

    public static void pushAllTest(){
        System.out.println("--------Push all test--------");
        MyStack<Number> myStack = new MyStack<Number>();
        Iterable<Integer> integers = List.of(1,2,3);
        Iterable<Number> numbers = List.of(100,200,300);
        //myStack.pushAllWithoutWildcard(integers); // error
        myStack.pushAll(integers);
        myStack.pushAll(numbers);
        myStack.printAll();

    }

}
