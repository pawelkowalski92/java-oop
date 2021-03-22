package pl.edu.utp.meancalculation;

// object oriented approach
public class MeanCounter {

    public static void main(String[] args) {
        int a = 20;
        int b = 30;
        int c = 40;

        ArithmeticMeanAlgorithm meanAlgorithm = new ArithmeticMeanAlgorithm();
        meanAlgorithm.add(a);
        meanAlgorithm.add(b);
        meanAlgorithm.add(c);
        meanAlgorithm.add(4);

        double mean = meanAlgorithm.calculateMean();
        System.out.println(mean);
    }

}
