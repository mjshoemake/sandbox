package mjs.examples;

import java.util.StringJoiner;

public class Base2SequenceGenerator {

    public Base2SequenceGenerator() {
    }

    public String generateSequence(int max) {
        StringJoiner joiner = new StringJoiner(", ");
        int current = 0, next = 1;
        System.out.println("   Processing...");
        while (current <= max) {
            joiner.add(current+"");
            current = next;
            next = next * 2;
            System.out.println("      " + current + " " + next + " - " + joiner.toString());
        }
        return joiner.toString();
    }
}
