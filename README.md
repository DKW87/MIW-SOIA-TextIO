# Opdracht Text IO

## Inleiding
In deze opdracht staat het lezen en schrijven van en naar een tekstbestand centraal. Je krijgt twee bestanden,
een bestand met namen die gesorteerd zijn en een bestand met namen die niet gesorteerd zijn. Allereerst
moet je een bestand met namen kunnen inlezen en omzetten naar een List. Vervolgens moet je in de List van
gesorteerde namen de andere namen zo toevoegen dat de lijst met namen gesorteerd blijft. We spreken hier
van een List, maar je gebruikt als instantie uiteraard een ArrayList. We gebruiken dus polymorfisme.
Tenslotte schrijf je de gesorteerde lijst weg naar een nieuw tekstbestand. Deze functionaliteit zetten we in een
klasse NamenBestandVerwerker met daarin static methods die het werk doen. De klasse is een soort
utility class zonder eigenschappen, alleen het gedrag is belangrijk. Daarom zijn de methoden static. We hebben
voor het gebruik van de methoden geen object nodig.

## Gebruik Git
Oefen bij deze opdracht het gebruik van Git.
1. In het stappenplan hieronder staan je taken. Als je een taak af hebt, dus de code geschreven en getest
   hebt, voeg dan de aangepaste bestanden toe aan de staging area en commit je code. Geef een concrete
   commit message aan je commit. Dus niet "Stap 2" maar bijvoorbeeld "Klasse NamenBestandVerwerker
   met methode telNamenBestand"

## Stappenplan

1. Start een nieuw project in IntelliJ genaamd NamenSorteren. Voeg aan het project een folder toe met de
   naam 'resources'. Op DLO kun je twee bestanden ophalen 'GesorteerdeNamenOrigineel.txt'
   en 'ExtraNamen.txt'. Zet deze bestanden (in je windows explorer of mac finder) in de folder
   'resources' van het IntelliJ project.

2. Ga naar de terminal in IntelliJ en initialiseer een repository

3. Maak een klasse NamenBestandVerwerker in de package controller aan.
    * Schrijf een methode public static int telNamenBestand(String
      bestandsnaam), waar je het pad en de bestandsnaam van het in te lezen bestand aan mee kunt
      geven. De methode maakt een File object aan en een Scanner object om het bestand te kunnen
      lezen. Vervolgens telt de methode het aantal regels in het bestand. Tip: gebruik een while-loop die
      herhaaldelijk de next() methode van het Scanner object aanroept, zolang er nog regels in het
      bestand zijn. Laat een teller meelopen.
    * Test in de main method binnen een Launcher klasse de methode en kijk of het aantal namen klopt.
      Tip: Gebruik constanten van het type String in de Launcher klasse om de bestandsnamen in op te
      slaan.

4. Schrijf een methode public static List<String> leesNamenBestand(String
   bestandsnaam), die de namen uit het bestand toevoegt aan een List en deze teruggeeft. Test in de
   main deze methode door daar de List die de methode teruggeeft te printen naar de console.

5. Schrijf een methode public static void voegNaamToeAanGesorteerdeLijst (String
   naam, List<String> lijst), die een naam aan de meegegeven lijst toevoegt. Let wel, de naam
   moet zodanig worden toegevoegd, dat de lijst gesorteerd blijft. Tip: Vergelijk de naam net zo lang met de
   namen uit de lijst, totdat deze 'alfabetisch groter' is en voeg toe op de plek waar je stopt. Gebruik
   add(index, object) van de List. Test je methode door in de main een paar namen toe te voegen.
   Print de lijst naar de console om te controleren of de naam op de goed plek staat. Voeg ook een naam toe
   die groter is dan alle namen in de lijst.

6. Schrijf een methode public static void voegLijstToeAanGesorteerdeLijst
   (List<String> nieuweLijst, List<String> oudeLijst), die een hele lijst met namen
   toevoegt aan een gesorteerde lijst, waar bij de lijst gesorteerd blijft. Je kunt hierbij natuurlijk heel handig
   gebruik maken van de methode uit stap 4. Test de methode in de main door de lijst van namen uit
   bestand 'ExtraNamen.txt' om te zetten naar een List en vervolgens toe te voegen aan de lijst van
   namen uit bestand 'GesorteerdeNamenOrigineel.txt'.

7. Schrijf een methode public static void maakBestandvanLijst(List<String> lijst,
   String bestandsnaam), die een lijst (in de vorm van een List) wegschrijft naar een bestand. De
   methode maakt een File object en een PrintWriter object waarmee je de namen uit de lijst kan
   printen naar het bestand. Schrijf de gesorteerde namenlijst weg naar een nieuw bestand genaamd
   'GesorteerdeNamenNieuw.txt'.