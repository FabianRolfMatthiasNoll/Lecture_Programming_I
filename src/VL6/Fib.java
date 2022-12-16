package VL6;

import java.util.Iterator;

public class Fib implements Iterable<Integer> {
    private int a = 0;
    private int b = 1;

    public static void main(String[] args) throws InterruptedException {
        Fib fib = new Fib();
        Iterator<Integer> iterator = fib.iterator();
        while (iterator.hasNext()) {
            int i = iterator.next();
            System.out.println(i);
            Thread.sleep(500);
        }
    }
    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                int result = a;
                a = b;
                b = result + b;
                return result;
            }
        };
    }
}

