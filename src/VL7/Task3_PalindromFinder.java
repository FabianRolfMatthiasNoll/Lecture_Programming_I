package VL7;

public class Task3_PalindromFinder {
    public static void main(String args[]){
        String str = "ABbA";
        if (isPalindrome(str)) {
            System.out.println(str + " ist ein Palindrom");
        } else {
            System.out.println(str + " ist kein Palindrom");
        }
    }

    public static boolean isPalindrome(String str) {
        // Wandle die Zeichenkette in Kleinbuchstaben um
        str = str.toLowerCase();
        // Basisfall: Wenn die Länge der Zeichenkette 1 oder 0 ist, ist sie immer ein Palindrom
        if (str.length() == 0 || str.length() == 1) {
            return true;
        }
        // Wenn das erste und das letzte Zeichen der Zeichenkette ungleich sind, ist es kein Palindrom
        if (str.charAt(0) != str.charAt(str.length() - 1)) {
            return false;
        }
        // Rufe die Methode rekursiv auf, um das mittlere Teilstück der Zeichenkette zu überprüfen
        return isPalindrome(str.substring(1, str.length() - 1));
    }
}
