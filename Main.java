package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.printDocs(10, false);
        printer.printDocs(15, true);
        printer.refillToner(100);
        printer.printDocs(-10, false);
        printer.printDocs(31, true);
        printer.printDocs(70, true);
    }
}
