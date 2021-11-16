package chapter5.generics.item26.rawTypes;

import java.util.HashSet;
import java.util.Set;

//Item 26: Don't use raw types
public class ComonSet {

    public static void main(String[] args) {
        Set n = Set.of(1,2,3,4,5,6);
        Set even = Set.of(2,4,6,8,10);
        System.out.println("unsafe commons elements: " + unsafeNumElementsInCommon(n, even));
        System.out.println("safe commons elements: " + unsafeNumElementsInCommon(n, even));
    }

    private static int unsafeNumElementsInCommon(Set s1, Set s2){
        int result = 0;
        for(Object o1:s1){
            if(s2.contains(o1)){
                result++;
            }
        }
        //s1.add("1"); this could be error prom
        return result;
    }

    private static int safeNumElementsInCommon(Set<?> s1, Set<?> s2){
        int result = 0;
        for(Object o1:s1){
            if(s2.contains(o1)){
                result++;
            }
        }
        //s1.add(1); this is marked as error
        return result;
    }
}
