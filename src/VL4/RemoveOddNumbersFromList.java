package VL4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class RemoveOddNumbersFromList {
    public static void main(String[] args) {
        List<Integer> zahlen = new LinkedList<Integer>();
        List<Integer> found = new ArrayList<Integer>();
        Iterator<Integer> numberIterator = zahlen.iterator();
        zahlen.add(5);
        zahlen.add(74);
        zahlen.add(58);
        zahlen.add(87);
        zahlen.add(37);
        zahlen.add(4);
        zahlen.add(35);
        zahlen.add(22);
        for (var num : zahlen) {
            if (num % 2 != 0){
                found.add(num);
            }
        }
        zahlen.removeAll(found);
        System.out.println(zahlen);
    }
}
