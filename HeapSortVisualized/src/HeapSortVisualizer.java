import java.awt.*;
import java.util.Arrays;
import java.util.Random;
import javax.swing.*;

public class HeapSortVisualizer {
    private int[] array;
    private JFrame frame;
    private ArrayPanel panel;
    private boolean isSorting = false;

    public HeapSortVisualizer(int[] array) {
        this.array = array;

        // Erstelle ein Fenster zum Darstellen des Arrays
        frame = new JFrame();
        frame.setTitle("Heap Sort Visualizer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Erstelle ein Panel, auf dem das Array dargestellt wird
        panel = new ArrayPanel();
        frame.add(panel);

        frame.pack();
        frame.setVisible(true);
    }

    public void sort() {
        isSorting = true;

        int n = array.length;

        // Erstelle einen Heap aus dem Array
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(n, i);

        // Entferne das größte Element aus dem Heap und füge es am Ende des Arrays ein
        for (int i = n - 1; i >= 0; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            heapify(i, 0);
            // Aktualisiere das Panel, um die Änderungen am Array darzustellen
            frame.repaint();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        isSorting = false;
    }

    // Rekursive Methode zum Erstellen eines Heaps aus einem Array
    private int currentPosition = -1;

    private void heapify(int n, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if (l < n && array[l] > array[largest])
            largest = l;

        if (r < n && array[r] > array[largest])
            largest = r;

        if (largest != i) {
            int swap = array[i];
            array[i] = array[largest];
            array[largest] = swap;

            currentPosition = i;
            heapify(n, largest);
        }
        // Aktualisiere das Panel, um die Änderungen am Array darzustellen
        panel.repaint();
        try {
            Thread.sleep(20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        currentPosition = -1;
    }

    // Innere Klasse, die das Array in einem Panel darstellt
    class ArrayPanel extends JPanel {
        @Override
        public Dimension getPreferredSize() {
            return new Dimension(500, 500);
        }

        int maxValue = Arrays.stream(array).max().getAsInt();

        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            int width = getWidth() / array.length;
            for (int i = 0; i < array.length; i++) {
                int value = array[i];
                int x = i * width;
                int y = getHeight() - (value * getHeight() / maxValue);
                if (currentPosition == i) {
                    g.setColor(Color.RED);
                } else {
                    g.setColor(Color.BLACK);
                }
                g.fillRect(x, y, width - 1, getHeight() - y);
            }
        }
    }

    public static void main(String[] args) {
        int[] array = new int[150];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(300) + 1;
        }
        HeapSortVisualizer visualizer = new HeapSortVisualizer(array);
        visualizer.sort();
    }
}