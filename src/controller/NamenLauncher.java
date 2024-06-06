package controller;

import java.util.ArrayList;
import java.util.List;

import static controller.NamenBestandVerwerker.*;

public class NamenLauncher {

    public static void main(String[] args) {

        // variabelen
        final String LOCATIE_EXTRA_NAMEN = "resources/ExtraNamen.txt";
        final String LOCATIE_GESORTEERDE_NAMEN = "resources/GesorteerdeNamenOrigineel.txt";
        final String NAAM_EXTRA_NAMEN = "extra namen lijst";
        final String NAAM_GESORTEERDE_NAMEN = "gesorteerde namen lijst";

        System.out.printf("In %s zitten %d namen. %n", NAAM_EXTRA_NAMEN, telNamenBestand(LOCATIE_EXTRA_NAMEN));
        System.out.printf("In %s zitten %d namen. %n%n",NAAM_GESORTEERDE_NAMEN, telNamenBestand(LOCATIE_GESORTEERDE_NAMEN));

        List<String> mijnExtraLijst = new ArrayList<>(leesNamenBestand(LOCATIE_EXTRA_NAMEN));
        List<String> mijnGesorteerdeLijst = new ArrayList<>(leesNamenBestand(LOCATIE_GESORTEERDE_NAMEN));

        printLijst(mijnExtraLijst, NAAM_EXTRA_NAMEN);
        printLijst(mijnGesorteerdeLijst, NAAM_GESORTEERDE_NAMEN);

        voegNaamToeAanGesoorteerdeLijst("Zacharias", mijnGesorteerdeLijst);
        voegNaamToeAanGesoorteerdeLijst("Henk", mijnGesorteerdeLijst);
        voegNaamToeAanGesoorteerdeLijst("Armin", mijnGesorteerdeLijst);
        voegNaamToeAanGesoorteerdeLijst("Bader", mijnGesorteerdeLijst);
        voegNaamToeAanGesoorteerdeLijst("Zack", mijnGesorteerdeLijst);
        voegNaamToeAanGesoorteerdeLijst("Miranda", mijnGesorteerdeLijst);

        printLijst(mijnGesorteerdeLijst, NAAM_GESORTEERDE_NAMEN);

    } // main

} // klasse
