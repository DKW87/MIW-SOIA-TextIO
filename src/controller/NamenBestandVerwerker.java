package controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NamenBestandVerwerker {

    // static methoden

    public static int telNamenBestand(String bestandsnaam) {
        File namenBestand = new File(bestandsnaam);
        int aantalRegels = 0;

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

} // klasse
