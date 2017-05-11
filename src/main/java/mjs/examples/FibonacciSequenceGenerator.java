package mjs.examples;

import java.util.StringJoiner;

public class FibonacciSequenceGenerator {

    public FibonacciSequenceGenerator() {
    }

    public String generateSequence(int max) {
        StringJoiner joiner = new StringJoiner(", ");
        int current = 0, next = 1;
        System.out.println("   Processing...");
        while (current <= max) {
            joiner.add(current+"");
            int newCurrent = next;
            next = current + next;
            current = newCurrent;
            if (current == 1 && next == 1) {
                next = 2;
            }
            System.out.println("      " + current + " " + next + " - " + joiner.toString());
        }
        return joiner.toString();
    }
}
