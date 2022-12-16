package VL5.Task2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class StudentDemo {
    public static void main(String[] args) {
        Set<Student> mengeUnsortiert = new HashSet(); // Hier HashSetobjekt
        Set<Student> mengeSortiert = new TreeSet(); // Hier TreeSetobjekt
        Student s;
        s = new Student("Curie", "Marie", 19, 1);
        mengeSortiert.add(s);
        mengeUnsortiert.add(s);
        s = new Student("Merian", "Maria-Sybilla", 17, 3);
        mengeSortiert.add(s);
        mengeUnsortiert.add(s);
        s = new Student("Noether", "Emmi", 16, 1);
        mengeSortiert.add(s);
        mengeUnsortiert.add(s);
        s = new Student("Liese", "Meitner", 15, 2);
        mengeSortiert.add(s);
        mengeUnsortiert.add(s);
        s = new Student("Herschel", "Caroline", 15, 2);
        mengeSortiert.add(s);
        mengeUnsortiert.add(s);
        ausgaben(mengeUnsortiert);
        System.out.println("===============================");
        ausgaben(mengeSortiert);
    }
    public static void ausgaben(Set<Student> menge) {
        Student s;
        Iterator<Student> studentIterator = menge.iterator();
        while (studentIterator.hasNext()) { // Die Schleife terminiert so nicht!
            // Hier Student aus Iterator in Schleife auslesen.
            s = studentIterator.next();
            System.out.println("Student: " + s); // Nicht ersetzen
        }
    }
}
