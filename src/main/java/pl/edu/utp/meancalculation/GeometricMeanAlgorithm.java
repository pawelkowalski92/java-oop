package pl.edu.utp.meancalculation;

public class GeometricMeanAlgorithm extends CountingMeanAlgorithm {

    // constructor
    public GeometricMeanAlgorithm() {
        // calling parent's constructor
        super(1);
    }

    @Override
    protected void doAdd(double factor) {
        super.currentSum *= factor;
    }

    @Override
    protected double doCalculateMean() {
        return Math.pow(currentSum, (double) 1 / noOfFactors);
    }

}
