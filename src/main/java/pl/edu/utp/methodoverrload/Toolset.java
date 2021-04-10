package pl.edu.utp.methodoverrload;

public class Toolset {

    int amountOfNails;
    int amountOfScrewdrivers;

    public Toolset(int amountOfNails, int amountOfScrewdrivers) {
        this.amountOfNails = amountOfNails;
        this.amountOfScrewdrivers = amountOfScrewdrivers;
    }

    public Toolset(int amountOfScrewdrivers) {
        this(100, amountOfScrewdrivers);
    }

    public Toolset() {
        this(100, 10);
    }

    public String getTool() {
        return "tool";
    }

    /*
    Rules for method overloading:
    1. Method name must be the same (but method signatures must differ)
     */
    public int getTool(int quantity) {
        return quantity * 2;
    }

    private void getTool(String tool) {
        System.out.println(tool);
    }

    public void describe() {
        System.out.println("I'm a toolbox with " + amountOfNails + " nails and " + amountOfScrewdrivers + " screwdrivers");
    }

}
