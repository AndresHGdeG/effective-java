package chapter5.generics.item28.preferList.chooser;

import java.util.Collection;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ObjectChooser {
    private final Object[] choiceArray;

    public ObjectChooser(Collection choices){
        choiceArray = choices.toArray();
    }

    public Object choose() {
        Random rnd = ThreadLocalRandom.current();
        return choiceArray[rnd.nextInt(choiceArray.length)];
    }

}
