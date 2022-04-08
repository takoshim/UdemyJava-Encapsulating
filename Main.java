package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.printDocs(10);
        printer.printDocs(15);
        printer.refillToner(80);
        printer.refillToner(120);
        printer.refillToner(-10);
        printer.refillToner(100);
        printer.printDocs(-10);
    }
}
