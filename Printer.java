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
        System.out.println("Duplex print feature is turned off.");
        displayTonerLevel();
        System.out.println("********************");
    }

    private void displayTonerLevel() {
        System.out.println("Toner level: " + this.tonerLevel);
    }
    public void printDocs(int numberOfPrinting, boolean doubleSided) {

        // Invalid printing number
        if (numberOfPrinting < 0) {
            System.out.println("Invalid number of page.");

        // Valid printing number
        } else {
            int printCounter = 0;  // Set counter
            System.out.println("Start printing " + numberOfPrinting + " page document.");

            // Double-sided print
            if (doubleSided) {
                System.out.println("Double sided printing.");
                for (int i = 1; i <= numberOfPrinting; i+=2) {
                    if (tonerLevel <= 1) {
                        System.out.println("Not enough toner. Print stopped.");
                        break;
                    }
                    tonerLevel -= 2;
                    numberOfPagePrinted += 2;
                    printCounter += 2;
                    System.out.println("  Page " + i + " & " + (i + 1) + " printed.");
                }
            }
            // Single-sided print
            else if (!doubleSided) {
                System.out.println("Single sided printing.");
                for (int i=1; i<=numberOfPrinting; ++i) {
                    if (tonerLevel <= 0) {
                        System.out.println("Not enough toner. Print stopped.");
                        break;
                    }
                    --tonerLevel;
                    ++numberOfPagePrinted;
                    ++printCounter;
                    System.out.println("  Page " + i + " printed.");
                }
            }
            // Complete printing
            if (printCounter >= numberOfPrinting) {
                System.out.println("Complete printing " + numberOfPrinting + " pages document.");
            }
        }
        // Display toner level and finish
        displayTonerLevel();
        System.out.println("********************");

    }

    public void turnOnDuplexPrint() {
        this.duplexPrintable = true;
        System.out.println("Duplex print feature on.");
        System.out.println("********************");
    }

    public void refillToner(int tonerLevel) {
        System.out.println("Refilling toner with " + tonerLevel + "% toner.");

        // Check if genuine toner and remaining level of 100%
        if (tonerLevel < 0 || tonerLevel > 100) {
            System.out.println("Invalid level of remaining toner.");
        } else if (tonerLevel < 100) {
            System.out.println("Cannot accept any toner other than new genuine ones.");
        } else {
            System.out.println("A new genuine toner is set.");
            this.tonerLevel = tonerLevel;
        }

        // Display toner level and finish
        displayTonerLevel();
        System.out.println("********************");
    }
}
