package chapter5.generics.item31.wildcards;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class MyStack <E>{

    private E[] elements;
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;

    /**
     * The elements array will contain only E instances from push(E).
     * This is sufficient to ensure type safety, but the runtime
     * tpe of the array won't be E[]; it will always be Object[]!
     */
    @SuppressWarnings("unchecked")
    public MyStack(){
        elements = (E[]) new Object[DEFAULT_CAPACITY];
    }
    public E pop() {
        if (size == 0) {
            throw new NoSuchElementException();
        }
        E element = elements[--size];
        elements[size] = null; // Eliminate obsolete reference
        return element;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void push(E element) {
        ensureCapacity();
        elements[size++] = element;
    }

    public int size() {
        return size;
    }

    /**
     * With this method we can only push list strictly of type E and not
     * a subtype of E. For example if we declare MyStack<Number>
     * it is not possible to inset Iterable<Integer> but Iterable<Number>
     * @param src
     */
    public void pushAllWithoutWildcard(Iterable<E> src) {
        for (E e : src){
            push(e);
        }

    }

    /**
     * With this method and the use of the wildcard ? we can insert
     * Iterable<Integer> when the instance is MyStack<Number> because
     * Integer is a subtype of Number
     * @param src
     */
    public void pushAll(Iterable<? extends E> src) {
        for (E e : src){
            push(e);
        }
    }

    private void ensureCapacity() {
        if (size == elements.length) {
            elements = Arrays.copyOf(elements, 2 * size + 1);
        }
    }

    public void printAll(){
        while(!this.isEmpty()) {
            E element = this.pop();
            System.out.println(element);
        }
    }
}
