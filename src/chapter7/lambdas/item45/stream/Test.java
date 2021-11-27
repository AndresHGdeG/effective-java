package chapter7.lambdas.item45.stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test {
    public static void main(String[] args) {
       String path = "src/chapter7/lambdas/item45/stream/dictionary.txt";
        int minGroupSize = 2;
        test(path,minGroupSize);

    }
    private static void test(String path, int minGroupSize){
        try {
            LegacyExample.compute(path, minGroupSize);
            System.out.println("----------------------------------");
            StreamExample.compute(path, minGroupSize);
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
