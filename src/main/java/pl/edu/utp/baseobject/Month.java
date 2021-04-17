package pl.edu.utp.baseobject;

public enum Month {

    JANUARY(31),
    FEBRUARY(28),
    MARCH(31);

    private final int amountOfDays;

    Month(int amountOfDays) {
        this.amountOfDays = amountOfDays;
    }

    public int getAmountOfDays() {
        return amountOfDays;
    }

}
