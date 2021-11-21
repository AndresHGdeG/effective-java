package chapter6.enums.item37.enumMap;

import java.util.Arrays;
import java.util.EnumSet;
import java.util.Set;

/**
 * Test of association of transition of material phases
 */
public class Test {
    public static void main(String[] args) {
        System.out.println(Phase.SOLID + " to " + Phase.LIQUID + ": " + Phase.Transition.from(Phase.SOLID, Phase.LIQUID));
        System.out.println(Phase.SOLID + " to " + Phase.GAS + ": " + Phase.Transition.from(Phase.SOLID, Phase.GAS));
        System.out.println(Phase.LIQUID + " to " + Phase.GAS + ": " + Phase.Transition.from(Phase.LIQUID, Phase.GAS));
        System.out.println(Phase.GAS + " to " + Phase.LIQUID + ": " + Phase.Transition.from(Phase.GAS, Phase.LIQUID));
        System.out.println(Phase.GAS + " to " + Phase.SOLID + ": " + Phase.Transition.from(Phase.GAS, Phase.SOLID));
        System.out.println(Phase.LIQUID + " to " + Phase.SOLID + ": " + Phase.Transition.from(Phase.LIQUID, Phase.SOLID));
    }
}
