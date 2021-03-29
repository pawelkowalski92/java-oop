package pl.edu.utp.meancalculation;

public abstract class CountingMeanAlgorithm implements MeanAlgorithm {

    private double currentSum;
    private double noOfFactors;

    CountingMeanAlgorithm(double currentSum) {
        currentSum = currentSum;
        noOfFactors = 0;
    }

    @Override
    public void add(double factor) {
        doAdd(factor);
        noOfFactors++;
    }

    abstract void doAdd(double factor);

    @Override
    public double calculateMean() {
        if (noOfFactors == 0) {
            throw new IllegalArgumentException("No factors included - cannot calculate mean!");
        }
        return doCalculateMean();
    }

    protected abstract double doCalculateMean();

}
