package controller;

import static controller.NamenBestandVerwerker.*;

public class NamenLauncher {

    public static void main(String[] args) {

        // variabelen
        final String LOCATIE_EXTRA_NAMEN = "resources/ExtraNamen.txt";
        final String LOCATIE_GESORTEERDE_NAMEN = "resources/GesorteerdeNamenOrigineel.txt";

        System.out.printf("In extra namen zitten %d namen. %n", telNamenBestand(LOCATIE_EXTRA_NAMEN));
        System.out.printf("In gesorteerde namen zitten %d namen. %n", telNamenBestand(LOCATIE_GESORTEERDE_NAMEN));

    } // main

} // klasse
