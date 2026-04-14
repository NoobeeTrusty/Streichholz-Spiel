import java.util.Scanner;

public class Eingabe {
    public static int leseZahl() {
        Ausgabe.zahlEingeben();
        Scanner myObj = new Scanner(System.in);
        String input = myObj.next();
        try {
            Integer.parseInt(input);
        } catch (Exception e) {
            Ausgabe.keineZahl();
            return leseZahl();
        }
        return Integer.parseInt(input);
    }

    public static int leseHoelzer() {
        int i = leseZahl();
        if(i > 4 || i < 0) {
            Ausgabe.zahlNichtImBereich();
            return leseHoelzer();
        }
        return i;
    }
}
