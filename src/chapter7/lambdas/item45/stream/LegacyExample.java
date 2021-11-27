package chapter7.lambdas.item45.stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class LegacyExample {

    public static void compute(String path, int minGroupSize) throws FileNotFoundException {
        File dictionary = new File(path);
        Map<String, Set<String>> groups = new HashMap<>();
        try(Scanner s = new Scanner(dictionary)) {
            while(s.hasNext()){
                String word = s.next();
                groups.computeIfAbsent(alphabetize(word),k -> new TreeSet<>()).add(word);
            }
        }
        for(Set<String> group:groups.values()){
            if(group.size()>=minGroupSize){
                System.out.println("group " + group);
            }
        }
    }

    private static String alphabetize(String word) {
        char[] letters = word.toCharArray();
        Arrays.sort(letters);
        return String.valueOf(letters);
    }
}
