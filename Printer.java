package com.timbuchalka;

public class Printer {
    private int tonerLevel = 20;
    private int numberOfPagePrinted;
    private boolean duplexPrintable = false;

    public Printer(int tonerLevel, int numberOfPagePrinted,
                   boolean duplexPrintable) {
        if (tonerLevel < 0 || tonerLevel > 100) {
            System.out.println("Invalid level of remaining toner.");
        } else if (tonerLevel < 100) {
            System.out.println("Cannot accept any toner other than new genuine ones.");
        } else {
            System.out.println("A new genuine toner is set.");
            this.tonerLevel = tonerLevel;
        }

        this.numberOfPagePrinted = numberOfPagePrinted;
        this.duplexPrintable = duplexPrintable;
    }

    public void printDocs(int numberOfPrinting) {
        if (numberOfPrinting < 0) {
            System.out.println("Invalid number of page.");
        }
        this.numberOfPagePrinted += numberOfPrinting;
        System.out.println("Printed: " + numberOfPagePrinted + " pages of document.");
        }
    }
}
