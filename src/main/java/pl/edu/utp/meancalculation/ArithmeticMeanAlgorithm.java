package pl.edu.utp.meancalculation;

// class declaration
/*
<access_modifier> <extra_keywords> class_name <extends other_class> <implements other_interface, ...> {
}
 */
public class ArithmeticMeanAlgorithm extends CountingMeanAlgorithm {

    // fields
    /*
    <access_modifier> <extra_keywords> field_type field_name; - declaration
    <access_modifier> <extra_keywords> field_type field_name = value; - declaration and initialization
     */

    // constructor
    /*
    <access_modifier> name_matching_class_name(<args list, ...>) {
        constructor_body
    }
     */
    public ArithmeticMeanAlgorithm() {
        super(0);
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
    @Override
    protected void doAdd(double a) {
        currentSum += a; // currentSum = currentSum + a;
    }

    @Override
    protected double doCalculateMean() {
        return currentSum / noOfFactors;
    }

}
