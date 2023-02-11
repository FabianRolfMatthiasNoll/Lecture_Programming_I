package VL6;

public class TryCatchProver {
    public String testFinally(int n) {
        try {
            if (n < 0) {
                throw new ArithmeticException("n ist negativ");
            }
            return "try";
        } catch (ArithmeticException e) {
            return "catch";
        } finally {
            System.out.println("finally");
        }
    }
}
/*
    ClassNotFoundException tritt auf, wenn der Java Virtual Machine (JVM) versucht, eine Klasse zu laden,
    die angegeben wurde, aber nicht gefunden werden kann. Dies kann passieren, wenn der Klassenname falsch
    geschrieben wurde, wenn die Klasse nicht im Klassenpfad enthalten ist oder wenn die Klasse aufgrund von
    Kompatibilitätsproblemen nicht geladen werden kann.

    NoClassDefFoundError tritt auf, wenn eine Klasse zur Laufzeit gefunden wurde,
    aber nicht verlinkt werden konnte. Dies kann passieren, wenn eine benötigte Klasse nicht
    im Klassenpfad enthalten ist oder wenn es während der Link-Zeit Probleme mit der Klasse gab.
    Im Gegensatz zu ClassNotFoundException wird NoClassDefFoundError nicht durch die
    Class.forName()-Methode ausgelöst, sondern tritt auf, wenn versucht wird, eine Methode oder
    ein Feld in der Klasse zu verwenden.

    Im Allgemeinen deutet ClassNotFoundException darauf hin, dass es während der Laufzeit
    Probleme beim Laden einer Klasse gab, während NoClassDefFoundError darauf hinweist,
    dass es während der Link-Zeit Probleme beim Verlinken einer Klasse gab. Beide können
    durch falsche Klassenpfade oder fehlende Abhängigkeiten verursacht werden und können
    durch Überprüfung des Klassenpfads und der Abhängigkeiten behoben werden.

 */