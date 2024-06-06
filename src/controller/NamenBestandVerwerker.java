package controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NamenBestandVerwerker {

    // attributen
    private static final int NUL = 0;
    private static final int EEN = 1;

    // static methoden

    public static int telNamenBestand(String bestandsnaam) {
        File namenBestand = new File(bestandsnaam);
        int aantalRegels = NUL;

        try {
            Scanner invoer = new Scanner(namenBestand);
            while (invoer.hasNextLine()) {
                invoer.nextLine(); // spring naar de volgende regel
                aantalRegels++;
            }
        } catch (FileNotFoundException nietGevonden) {
            System.out.println("Het bestand is niet gevonden.");
        }
        return aantalRegels;
    }

    public static List<String> leesNamenBestand(String bestandsnaam) {
        File namenBestand = new File(bestandsnaam);
        int aantalNamen = telNamenBestand(bestandsnaam);
        List<String> lijstNamen = new ArrayList<>(aantalNamen);

        try {
            Scanner invoer = new Scanner(namenBestand);
            while (invoer.hasNextLine()) {
                lijstNamen.add(invoer.nextLine());
            }
        } catch (FileNotFoundException nietGevonden) {
            System.out.println("Het bestand is niet gevonden.");
        }

        return lijstNamen;
    }

    public static void printLijst(List<String> lijst, String naam) {
        final int RESULTATEN_PER_REGEL = 8;

        for (int i = NUL; i < lijst.size(); i++) {
            if (i == NUL) {
                System.out.printf("De %s bevat de volgende namen: %s, ", naam, lijst.get(i));
            } else if (i != lijst.size() - EEN) {
                System.out.printf("%s, ", lijst.get(i));
            } else {
                System.out.printf("%s.%n%n", lijst.get(i));
            }
            if (i % RESULTATEN_PER_REGEL == NUL) {
                System.out.println();
            }
        }
    }

    public static void voegNaamToeAanGesorteerdeLijst(String naam, List<String> lijst) {
        boolean isIngevoerd = false;

        for (int i = NUL; i < lijst.size(); i++) {
            if (lijst.get(i).compareTo(naam) > NUL && !isIngevoerd) {
                lijst.add(i, naam);
                isIngevoerd = true;
            } else if ((i == (lijst.size() - EEN) && !isIngevoerd)) {
                lijst.add(i + EEN, naam);
                isIngevoerd = true;
            }
        }
    }

    public static void voegLijstToeAanGesorteerdeLijst(List<String> hoofdLijst, List<String> inTeVoegenLijst) {
        for (String string : inTeVoegenLijst) {
            voegNaamToeAanGesorteerdeLijst(string, hoofdLijst);
        }
    }

    public static void maakBestandVanLijst (List<String> lijst, String bestandsnaam) {
        File uitvoerBestand = new File(bestandsnaam);
        try {
            PrintWriter printWriter = new PrintWriter(uitvoerBestand);
            for (String string : lijst) {
                printWriter.println(string);
            }
            printWriter.close();
            System.out.printf("Lijst succesvol naar '%s' geschreven. %n", bestandsnaam);
        } catch (FileNotFoundException nietGemaakt) {
            System.out.println("Het bestand kon niet worden aangemaakt.");
        }
    }

} // klasse
