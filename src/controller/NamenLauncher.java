package controller;

import java.util.ArrayList;
import java.util.List;

import static controller.NamenBestandVerwerker.*;

public class NamenLauncher {

    public static void main(String[] args) {

        // variabelen
        final String LOCATIE_EXTRA_NAMEN = "resources/ExtraNamen.txt";
        final String LOCATIE_GESORTEERDE_NAMEN = "resources/GesorteerdeNamenOrigineel.txt";

        System.out.printf("In extra namen zitten %d namen. %n", telNamenBestand(LOCATIE_EXTRA_NAMEN));
        System.out.printf("In gesorteerde namen zitten %d namen. %n%n", telNamenBestand(LOCATIE_GESORTEERDE_NAMEN));

        List<String> mijnExtraLijst = new ArrayList<>(leesNamenBestand(LOCATIE_EXTRA_NAMEN));
        List<String> mijnGesorteerdeLijst = new ArrayList<>(leesNamenBestand(LOCATIE_GESORTEERDE_NAMEN));

        for (int i = 0; i < mijnExtraLijst.size(); i++) {
            if (i == 0) {
                System.out.print("De extra lijst bevat de volgende namen: ");
            }
            else if (i != mijnExtraLijst.size() - 1) {
                System.out.printf("%s, ", mijnExtraLijst.get(i));
            }
            else {
                System.out.printf("%s.%n", mijnExtraLijst.get(i));
            }
        }

        for (int i = 0; i < mijnGesorteerdeLijst.size(); i++) {
            if (i == 0) {
                System.out.print("De gesorteerde lijst bevat de volgende namen: ");
            }
            else if (i != mijnGesorteerdeLijst.size() - 1) {
                System.out.printf("%s, ", mijnGesorteerdeLijst.get(i));
            }
            else {
                System.out.printf("%s.%n", mijnGesorteerdeLijst.get(i));
            }
        }

    } // main

} // klasse
