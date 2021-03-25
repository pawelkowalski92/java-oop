package pl.edu.utp.meancalculation;

public class ArithmeticMeanAlgorithm implements MeanAlgorithm {

    // fields
    /*
    <access_modifier> <extra_keywords> field_type field_name; - declaration
    <access_modifier> <extra_keywords> field_type field_name = value; - declaration and initialization
     */
    private double currentSum;
    private double noOfFactors;

    // constructor
    public ArithmeticMeanAlgorithm() {
        currentSum = 0;
        noOfFactors = 0;
    }

    // methods
    /*
    <access_modifier> <extra_keywords> returned_type method_name(<args list, ...>) {
        ...
        method_body
        return <type>; (except void)
    }
    <arg> - <extra_keywords> arg_type arg_name
     */
    public void add(double a) {
        currentSum += a; // currentSum = currentSum + a;
        noOfFactors++; // noOfFactors = noOfFactors + 1;
    }

    @Override
    public double calculateMean() {
        return currentSum / noOfFactors;
    }

}
