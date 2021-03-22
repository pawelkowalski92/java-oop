package pl.edu.utp;

// structural programming
public class ArithmeticMeanCounter {

    public static void main(String[] args) {
        int a = 20;
        int b = 30;
        int c = 40;

        double mean = calculateArithmeticMean(a, b, c);
        System.out.println(mean);
    }

    public static double calculateArithmeticMean(int... factors) {
        int sum = 0;
        for (int i = 0; i < factors.length; i++) {
            sum += factors[i];
        }
        return (double) sum / factors.length;
    }

}
