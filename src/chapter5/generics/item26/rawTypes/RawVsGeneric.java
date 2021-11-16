package chapter5.generics.item26.rawTypes;

import java.util.ArrayList;
import java.util.List;

public class RawVsGeneric {
    public static void main(String[] args) {
        List myRawList = new ArrayList();
        List<Object> myGenericList = new ArrayList<>();
        myRawList.add(getWords());
        myGenericList.add(getWords());
        System.out.println("List inserted");
        myRawList.forEach(System.out::println);
        myGenericList.forEach(System.out::println);
    }

    public static List<String> getWords(){
        List<String> words = new ArrayList<>();
        words.add("Hello");
        words.add("World");
        return words;
    }
}
