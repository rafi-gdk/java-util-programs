package com.sonu.utils.thread;

public class PrintingAlternative {
    int counter = 10;

    public void printOddNumber() {
        synchronized (this) {
            for (int i = 1; i <= counter; i++) {

                if (i % 2 != 0) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println("Odd--> " + i);
                }
                notify();
            }
        }
    }

    public void printEvenNumber() {
        synchronized (this) {
            for (int i = 1; i <= counter; i++) {

                if (i % 2 == 0) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println("Even--> " + i);
                }
                notify();
            }
        }
    }

    public static void main(String[] args) {

        PrintingAlternative mt = new PrintingAlternative();

        Thread t1 = new Thread(new Runnable() {
            public void run() {
                mt.printOddNumber();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            public void run() {
                mt.printEvenNumber();
            }
        });

        t1.start();
        t2.start();
    }
}
