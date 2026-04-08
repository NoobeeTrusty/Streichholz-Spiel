public class Ausgabe {
    public static void zahlEingeben() {
        System.out.println("Spieler, gebe eine Zahl ein.");
    }

    public static void keineZahl() {
        System.out.println("Die Eingabe ist keine Zahl.");
    }

    public static void zahlNichtImBereich() {
        System.out.println("Die Zahl ist nicht im gültigen Bereich (1-3).");
    }

    public static void menschGewinnt() {
        System.out.println("Hurra, du hast gewonnen!");
    }

    public static void computerGewinnt() {
        System.out.println("Der Computer hat gesiegt..");
    }

    public static void zugNichtMoeglich() {
        System.out.println("Für deinen Zug sind nicht genug Streichhölzer auf dem Spielfeld.");
    }

    public static void spielstand(int aktuelleAnzahl) {
        System.out.println(schreibeStand(aktuelleAnzahl));
    }

    public static void menschZug(int gezogene, int verbleibende) {
        System.out.println("Spieler zieht " + gezogene + schreibeGezogene(gezogene) + schreibeStand(verbleibende));
    }

    public static void computerZug(int gezogene, int verbleibende) {
        System.out.println("Computer zieht " + gezogene + schreibeGezogene(gezogene) + schreibeStand(verbleibende));
    }

    private static String schreibeGezogene(int i) {
        if(i == 1) {
            return " Streichholz. ";
        }else {
            return " Streichhölzer. ";
        }
    }

    private static String schreibeStand(int i) {
        if(i == 1) {
            return "Es ist noch 1 Streichholz übrig";
        } else {
            return "Es sind noch " + i + " Streichhölzer übrig.";
        }
    }
}

