package VL4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task5 {

    public static void main(String[] args){
        List<String> list = new ArrayList<String>();
        list.add("Franz");
        list.add("Hans");
        Iterator<String> listIterator = list.iterator(); //gäbe auch list.listIterator der hat mehr features
        System.out.println(list);
        while (listIterator.hasNext()){
            String listElem = listIterator.next();
            if (listElem.equals("Hans")){
                list.set(list.indexOf("Hans"), "gelöscht");
            }
        }
        System.out.println(list);
    }
}
