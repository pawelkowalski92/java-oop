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

        double mean = meanAlgorithm.calculateMean();
        System.out.println(mean);

        GeometricMeanAlgorithm geoMeanAlgorithm = new GeometricMeanAlgorithm();
        geoMeanAlgorithm.add(a);
        geoMeanAlgorithm.add(b);
        geoMeanAlgorithm.add(c);

        double geoMean = geoMeanAlgorithm.calculateMean();
        System.out.println(geoMean);
    }

}
