package pl.edu.utp.animalkingdom.mammals;

// this class can no longer be extended due to keyword `final`
public final class Cat extends Mammal {

    // this field is marked final - it can be initialized only once
    private final boolean hasTail;
    private Human owner;

    public Cat(boolean hasTail) {
        this.hasTail = hasTail;
    }

    public void setOwner(Human owner) {
        this.owner = owner;
    }

    @Override
    protected void rejectFood(String food) {
        super.rejectFood(food);
        System.err.println("Perhaps my owner " + owner.getName() + " can eat this?");
        owner.eat(food);
    }

    /** when field is marked with `final` keyword, we cannot create a setter
    public void setHasTail(boolean hasTail) {
        this.hasTail = hasTail;
    }
     */

    @Override
    protected boolean canEat(String food) {
        return food.startsWith("fish");
    }

}
