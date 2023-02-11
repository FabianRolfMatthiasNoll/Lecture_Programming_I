import java.text.SimpleDateFormat;

public class Main {
    public static void main(String... args) throws Exception {
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        System.out.println(formatter.parse("08/16/2011"));
    }
}
/*
Der Fehler liegt in der Verwendung des Formats "mm/DD/yyyy",
das als Monat-Minuten-Tag-Jahr interpretiert wird. Das korrekte
Format für Monat-Tag-Jahr sollte "MM/dd/yyyy" sein.
 */

/*
Aufgabe 2
Dieses Programmbeispiel erstellt eine Liste von Doubles (1.5, 2.3, 3.4, 7.8) und berechnet deren Summe.
Die Summe wird in einer Schleife durch die Liste berechnet, indem jedes Element in der Liste mit der
Variablen "x" verknüpft wird. Am Ende wird die Summe auf der Konsole ausgegeben, wobei das Format für die
Ausgabe auf 6 Stellen mit 2 Dezimalstellen festgelegt wird.
*/