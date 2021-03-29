package pl.edu.utp;

import pl.edu.utp.meancalculation.ArithmeticMeanAlgorithm;
import pl.edu.utp.meancalculation.GeometricMeanAlgorithm;
import pl.edu.utp.meancalculation.MeanAlgorithm;

// object oriented approach
public class OOPMeanCounter {

    public static void main(String[] args) {
        int a = 20;
        int b = 30;
        int c = 40;

        calculateMean(new ArithmeticMeanAlgorithm(), a, b, c);
        calculateMean(new GeometricMeanAlgorithm(), a, b, c);

        // this throws exception - as expected from business logic
//        calculateMean(new ArithmeticMeanAlgorithm()/*, empty double[] */);
//        calculateMean(new GeometricMeanAlgorithm()/*, empty double[] */);

        // code is protected, cannot use algorithm in harmful way
        ArithmeticMeanAlgorithm alg = new ArithmeticMeanAlgorithm();
        alg.add(1);
        alg.add(2);
        alg.add(3);
        double result = alg.calculateMean();
        System.out.println(result);

    }

    public static void calculateMean(MeanAlgorithm algorithm, double... factors) {
        for (double factor : factors) {
            algorithm.add(factor);
        }
        System.out.println(algorithm.calculateMean());
    }

}
