package VL5.Task3;

import java.util.*;
public class MapIterDemo {
    public static void main(String[] args) {
        Map<Integer,Student> matrikelMap = new TreeMap<Integer,Student>(); // Ersetzen Sie xxx
        Map<String, Student> nachnameMap = new HashMap<String,Student>();// Ersetzen Sie xxx
        Student s;
        s = new Student("Curie", "Marie", 19, 1);
        // Einsetzen: Studenten s in die beiden Maps eintragen. Schlüssel beachten!
        s = new Student("Merian", "Maria-Sybilla", 17, 3);
        // Einsetzen: Studenten s in die beiden Maps eintragen. Schlüssel beachten!
        s = new Student("Noether", "Emmi", 16, 1);
        // Einsetzen: Studenten s in die beiden Maps eintragen. Schlüssel beachten!
        s = new Student("Meitner", "Liese", 15, 2);
        // Einsetzen: Studenten s in die beiden Maps eintragen. Schlüssel beachten!
        s = new Student("Herschel", "Caroline", 20, 2);
        // Einsetzen: Studenten s in die beiden Maps eintragen. Schlüssel beachten!
        ausgabenMatrikelnr(matrikelMap);
        //ausgabenNamen(nachnameMap);
    }
    public static void ausgabenMatrikelnr(Map<Integer,Student> mp) {
        int s;
        Student st;

        Iterator<Integer> iterMatrikel = mp.keySet().iterator(); // Einsetzen: Zuweisen des Iterators
        System.out.println("Name (" + mp.getClass() + "):");
        while (iterMatrikel.hasNext()) { // Einsetzen: Iteratorbedingung einfügen
            s = iterMatrikel.next().intValue(); // Einsetzen: Auslesen des Iterators
            System.out.println("Matrikelnummer: " + s);
        }
        int mnr = 15;
        System.out.println("Student mit Matrikelnummer " + mnr +" ist:" + null); // Einsetzen!
        mnr = 16;
        System.out.println("Student mit Matrikelnummer " + mnr +" ist:" + null ); // Einsetzen!
        System.out.println("Alle Werte der MatrikelMap:");
        Collection<Student> l = null; // Einsetzen: Collection mit den Studenten
        Iterator<Student> iterStudi = l.iterator();
        System.out.println("Name ("+ mp.getClass() + "):");
        while (true) { // Einsetzen: Schleifenbedingung des Iterators
            // Einsetzen: Auslesen des nächsten Studenten
            System.out.println("Student: " + st);
        }
    }
    public static void ausgabenNamen(Map<String,Student> mp) {
        String str;
        Student st;
        System.out.println("Einsetzen: Vorbereitungen zum Auslesen der Nachnamen");
        System.out.println("Namen ("
                + mp.getClass() + "):");
        while (true) { // Einsetzen: Iteratorbedingung einfügen
            str = null;// Einsetzen: Auslesen des Iterators
            System.out.println("Nachname: " + str);
        }
        String nme = "Merian";
        System.out.println("Student mit Name " + nme +" ist:" + null);
        // Einsetzen der Operation zum Auslesen der Studentin mit Namen nme
        nme = "Herschel";
        System.out.println("Student mit Name " + nme + " ist:" + null);
        // Einsetzen der Operation zum Auslesen der Studentin mit Namen nme
        System.out.println("Alle Werte der NamenMap:");
        Collection<Student> l = null; // Einsetzen: Auslesen der gesamten Collection
        Iterator<Student> iterStudi = l.iterator();
        System.out.println("Name ("+ mp.getClass() + "):");
        while (true) { // Einsetzen: Iteratorbedingung einfügen
            st = null;// Einsetzen: Auslesen des Iterators
            System.out.println("Student: " + st);
        }
    }
}
