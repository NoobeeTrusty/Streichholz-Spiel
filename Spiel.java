public class Spiel{
    public int anzahlHölzer;

    public Spiel(int a) {
        anzahlHölzer = a;

        while (anzahlHölzer >= 0) {
            computerZiehen();
            if(anzahlHölzer <= 0) {
                Ausgabe.menschGewinnt();
                break;
            }
            menschZiehen();
            if(anzahlHölzer <= 0) {
                Ausgabe.computerGewinnt();
            }
        }
    }

    public void computerZiehen() {
        int eingabe = berechneComputerZug();
        anzahlHölzer = anzahlHölzer - eingabe;
        Ausgabe.computerZug(eingabe, anzahlHölzer);
    }

    public void menschZiehen() {
        int eingabe = Eingabe.leseHoelzer();
        if(eingabe > anzahlHölzer) {
            Ausgabe.zugNichtMoeglich();
            menschZiehen();
        }
        anzahlHölzer = anzahlHölzer - eingabe;
        Ausgabe.menschZug(eingabe, anzahlHölzer);
    }

    private int berechneComputerZug() {
        int i = (int) Math.round((Math.random() * (3 - 1)) + 1);
        if(i > anzahlHölzer){
            berechneComputerZug();
        }
        return i;
    }

}