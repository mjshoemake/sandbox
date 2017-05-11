package mjs.examples;

public class ExampleUtils {

    // Cheating
    public static String replaceChar(String source, char oldChar, char newChar) {
        return source.replace(oldChar, newChar);
    }

    // Non-recursive
    public static String replaceChar2(String source, char oldChar, char newChar) {
        StringBuilder builder = new StringBuilder();
        for (int i=0; i <= source.length()-1; i++) {
            char current = source.charAt(i);
            if (current == oldChar) {
                builder.append(newChar);
            } else {
                builder.append(current);
            }
        }
        return builder.toString();
    }

    // Recursive
    public static void replaceChar3(StringBuilder builder, String source, char oldChar, char newChar, int currentIndex) {
        char current = source.charAt(currentIndex);
        if (current == oldChar) {
            builder.append(newChar);
        } else {
            builder.append(current);
        }
        if (currentIndex < source.length()-1) {
            replaceChar3(builder, source, oldChar, newChar, currentIndex+1);
        }
    }

    // Is this number a prime number?
    public static boolean isPrime(int number) {
        // Check to see if the number is prime.
        for (int i=2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

}
