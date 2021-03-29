package pl.edu.utp.meancalculation;

public abstract class CountingMeanAlgorithm implements MeanAlgorithm {

    // access modifiers
    // private < <package> < protected < public
    protected double currentSum;
    protected double noOfFactors;

    protected CountingMeanAlgorithm(double currentSum) {
        // when variable hides a field, use `this`
        this.currentSum = currentSum;
        this.noOfFactors = 0;
    }

    @Override
    public void add(double factor) {
        doAdd(factor);
        noOfFactors++;
    }

    protected abstract void doAdd(double factor);

    @Override
    public double calculateMean() {
        if (noOfFactors == 0) {
            throw new IllegalArgumentException("No factors included - cannot calculate mean!");
        }
        return doCalculateMean();
    }

    protected abstract double doCalculateMean();

}
