package controller;

import java.util.ArrayList;
import java.util.List;

import static controller.NamenBestandVerwerker.*;

public class NamenLauncher {

    public static void main(String[] args) {

        // variabelen
        final String LOCATIE_EXTRA_LIJST = "resources/ExtraNamen.txt";
        final String LOCATIE_GESORTEERDE_LIJST = "resources/GesorteerdeNamenOrigineel.txt";
        final String LOCATIE_COMPLETE_LIJST = "resources/lijstcompleet.txt";
        final String NAAM_EXTRA_LIJST = "extra namen lijst";
        final String NAAM_GESORTEERDE_LIJST = "gesorteerde namen lijst";

        System.out.printf("In %s zitten %d namen. %n", NAAM_EXTRA_LIJST, telNamenBestand(LOCATIE_EXTRA_LIJST));
        System.out.printf("In %s zitten %d namen. %n%n",NAAM_GESORTEERDE_LIJST, telNamenBestand(LOCATIE_GESORTEERDE_LIJST));

        List<String> mijnExtraLijst = new ArrayList<>(leesNamenBestand(LOCATIE_EXTRA_LIJST));
        List<String> mijnGesorteerdeLijst = new ArrayList<>(leesNamenBestand(LOCATIE_GESORTEERDE_LIJST));

        printLijst(mijnExtraLijst, NAAM_EXTRA_LIJST);
        printLijst(mijnGesorteerdeLijst, NAAM_GESORTEERDE_LIJST);

        voegNaamToeAanGesorteerdeLijst("Zacharias", mijnGesorteerdeLijst);
        voegNaamToeAanGesorteerdeLijst("Henk", mijnGesorteerdeLijst);
        voegNaamToeAanGesorteerdeLijst("Armin", mijnGesorteerdeLijst);
        voegNaamToeAanGesorteerdeLijst("Bader", mijnGesorteerdeLijst);
        voegNaamToeAanGesorteerdeLijst("Zack", mijnGesorteerdeLijst);
        voegNaamToeAanGesorteerdeLijst("Miranda", mijnGesorteerdeLijst);

        printLijst(mijnGesorteerdeLijst, NAAM_GESORTEERDE_LIJST);

        voegLijstToeAanGesorteerdeLijst(mijnGesorteerdeLijst,mijnExtraLijst);

        printLijst(mijnGesorteerdeLijst, NAAM_GESORTEERDE_LIJST);

        maakBestandVanLijst(mijnGesorteerdeLijst, LOCATIE_COMPLETE_LIJST);

    } // main

} // klasse
