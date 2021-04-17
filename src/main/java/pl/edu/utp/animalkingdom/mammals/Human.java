package pl.edu.utp.animalkingdom.mammals;

public class Human extends Mammal {

    @Override
    protected boolean canEat(String food) {
        return food.endsWith("salad");
    }

}
