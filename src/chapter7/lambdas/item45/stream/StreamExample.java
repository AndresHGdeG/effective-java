package chapter7.lambdas.item45.stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import static java.util.stream.Collectors.groupingBy;
import java.util.stream.Stream;

public class StreamExample {

    public static void compute(String path, int minGroupSize) throws IOException {
        Path dictionary = Paths.get(path);
        try (Stream<String> s = Files.lines(dictionary)){
            s.collect(groupingBy(StreamExample::alphabetize))
                    .values()
                    .stream()
                    .filter(g->g.size()>=minGroupSize)
                    .forEach(System.out::println);
        }
    }

    private static String alphabetize(String word) {
        char[] letters = word.toCharArray();
        Arrays.sort(letters);
        return String.valueOf(letters);
    }
}
