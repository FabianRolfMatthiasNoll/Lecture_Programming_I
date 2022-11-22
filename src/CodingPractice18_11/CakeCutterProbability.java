import java.util.Random;

public class CakeCutterProbability {
    public static void main(String[] args) {
        Random rd = new Random();

        double candleLeft;
        double candleRight;

        int counter = 0;
        int sampleCount = 10000;

        for (int i = 0; i <= sampleCount; i++){
            double candleOne = rd.nextDouble();
            double candleTwo = rd.nextDouble();
            double knifeCut = rd.nextDouble();

            if (candleOne > candleTwo) {
                candleRight = candleOne;
                candleLeft = candleTwo;
            } else {
                candleRight = candleTwo;
                candleLeft = candleOne;
            }

            if(knifeCut < candleRight && knifeCut > candleLeft) counter++;
        }
        System.out.println("After Sampling " + sampleCount + " times.");
        System.out.println("The Probability to hit between two candles is: " + (100.00 / sampleCount) * counter + "%");
    }
}