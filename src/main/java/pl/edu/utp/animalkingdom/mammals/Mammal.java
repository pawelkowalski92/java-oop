package pl.edu.utp.animalkingdom.mammals;

public abstract class Mammal {

    private double weight;
    private int legCount;
    private String name;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getLegCount() {
        return legCount;
    }

    public void setLegCount(int legCount) {
        this.legCount = legCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // this method can no longer be overridden due to keyword `final`
    public final void eat(String food) {
        if (canEat(food)) {
            acceptFood(food);
        } else {
            rejectFood(food);
        }
    }

    protected void acceptFood(String food) {
        System.out.println(getName() + " is eating: " + food);
    }

    protected void rejectFood(String food) {
        System.err.println(getName() + " cannot eat " + food + "! :(");
    }

    protected abstract boolean canEat(String food);

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Mammal{");
        sb.append("name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }

}
