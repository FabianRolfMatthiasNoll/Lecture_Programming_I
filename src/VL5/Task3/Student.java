package VL5.Task3;

public class Student implements Comparable<Student>{
    int matrikelnr;
    String name;
    String vorname;
    int semester;
    public Student(String n, String vn, int nr, int sem) {
        name = n;
        vorname = vn;
        matrikelnr = nr;
        semester = sem;
    }
    public String toString() {
        return "(" + matrikelnr + "," + name + " " + vorname + ", " +
                semester + ")";
    }
    /**
     * Studenten werden anhand Ihre Matrikelnr verglichen
     *
     * @param o
     * @return
     */
    public int compareTo(Student o) {
        int diff = 0;
        if (o.getClass() == getClass()) {
            diff = matrikelnr - ((Student) o).matrikelnr;
        }
        if (diff > 0) {
            diff = 1;
        }
        if (diff < 0) {
            diff = -1;
        }
        return diff;
    }
    public boolean equals(Student o) {
        return (compareTo(o) == 0);
    }
    public int hashCode() {
        return matrikelnr;
    }

}
