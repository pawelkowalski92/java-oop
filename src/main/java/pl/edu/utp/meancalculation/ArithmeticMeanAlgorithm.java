package pl.edu.utp.meancalculation;

public class ArithmeticMeanAlgorithm {

    // fields
    int currentSum;
    int noOfFactors;

    // constructor
    public ArithmeticMeanAlgorithm() {
        currentSum = 0;
        noOfFactors = 0;
    }

    // methods
    public void add(int a) {
        currentSum += a; // currentSum = currentSum + a;
        noOfFactors++; // noOfFactors = noOfFactors + 1;
    }

    public double calculateMean() {
        return (double) currentSum / noOfFactors;
    }

}
