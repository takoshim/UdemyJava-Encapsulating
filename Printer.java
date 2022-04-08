package com.timbuchalka;

public class Printer {
    private int tonerLevel;
    private int numberOfPagePrinted;
    private boolean duplexPrintable = false;

    private Printer(int tonerLevel, int numberOfPagePrinted,
                   boolean duplexPrintable) {
        this.tonerLevel = tonerLevel;
        this.numberOfPagePrinted = numberOfPagePrinted;
        this.duplexPrintable = duplexPrintable;
    }

    public Printer() {
        this(20, 0, false);
        System.out.println("You bought a new printer!");
        System.out.println("********************");
    }

    public void printDocs(int numberOfPrinting) {
        int printCounter = 0;
        if (numberOfPrinting < 0) {
            System.out.println("Invalid number of page.");
        }

        System.out.println("Start printing " + numberOfPrinting + " page document.");
        for (int i=1; i<=numberOfPrinting; ++i) {
            if (tonerLevel <= 0) {
                System.out.println("Not enough toner. Print stopped.");
                break;
            } else {
                --tonerLevel;
                ++numberOfPagePrinted;
                ++printCounter;
                System.out.println("  Page " + i + " printed.");
            }
        }
        if (printCounter >= numberOfPrinting) {
            System.out.println("Complete printing " + numberOfPrinting + " pages document.");
        }
        System.out.println("Toner level: " + this.tonerLevel);
        System.out.println("********************");
    }

    public void turnOnDuplexPrint() {
        this.duplexPrintable = true;
        System.out.println("Duplex print feature on.");
        System.out.println("********************");
    }

    public void refillToner(int tonerLevel) {
        System.out.println("Refilling toner with " + tonerLevel + "% toner.");

        if (tonerLevel < 0 || tonerLevel > 100) {
            System.out.println("Invalid level of remaining toner.");
        } else if (tonerLevel < 100) {
            System.out.println("Cannot accept any toner other than new genuine ones.");
        } else {
            System.out.println("A new genuine toner is set.");
            this.tonerLevel = tonerLevel;
        }
        System.out.println("Toner level: " + this.tonerLevel);
        System.out.println("********************");
    }
}
