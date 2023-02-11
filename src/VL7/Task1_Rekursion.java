package VL7;

public class Task1_Rekursion {
    public static void main(String args[]){
       f(5);
    }
    public static void f(int n) {
        if (n <= 0) {
            System.out.println("Abbruch in f, Wert:"+n);
            return;
        }
        g(n+1);
    }
    public static void g(int n) {
        if (n <= 0) {
            System.out.println("Abbruch in g, Wert:"+n);
            return;
        }
        f(n-2);
    }
}
