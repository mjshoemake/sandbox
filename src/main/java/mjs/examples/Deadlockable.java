package mjs.examples;

import java.util.StringJoiner;

public class Deadlockable {

    public Deadlockable() {
    }

    public void method1() {
        synchronized(String.class) {
            System.out.println("1. Obtained lock on String class.");
            synchronized(Integer.class) {
                System.out.println("1. Obtained lock on Integer class.");
            }
        }
    }

    public void method2() {
        synchronized(Integer.class) {
            System.out.println("2. Obtained lock on Integer class.");
            synchronized(String.class) {
                System.out.println("2. Obtained lock on String class.");
            }
        }
    }

    public static void main(String args[]) {
        Thread thread1 = new Thread() {
            public void run() {
                Deadlockable deadlockable = new Deadlockable();
                for (int i=1; i <= 1000; i++) {
                    deadlockable.method1();
                    System.out.println("Thread 1 complete: iteration " + i);
                }
            }
        };

        Thread thread2 = new Thread() {
            public void run() {
                Deadlockable deadlockable = new Deadlockable();
                for (int i=1; i <= 1000; i++) {
                    deadlockable.method2();
                    System.out.println("Thread 2 complete: iteration " + i);
                }
            }
        };

        thread1.start();
        thread2.start();
    }
}
