package chapter5.generics.item28.preferList;

import java.util.ArrayList;
import java.util.List;

public class LegalRawListWithArray {

    public static void main(String[] args) {
        List[] phrases = new ArrayList[2];
        phrases[0]= new ArrayList(){{add("Hello");add(" ");add("world");}};
        phrases[1]=new ArrayList(){{add("Ho");add("No");add(" ");add("our table");add("is broken");}};

        for(List phrase : phrases){
            phrase.forEach(System.out::print);
            System.out.println("-----------");
        }
    }

}
