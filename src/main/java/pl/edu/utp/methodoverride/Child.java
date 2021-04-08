package pl.edu.utp.methodoverride;

import java.util.Random;

public class Child extends Parent {

    public int generateRandom() {
        return new Random().nextInt();
    }

    @Override
    public void displayA() {
        System.out.println("Alternative: " + super.getB());
    }

    /*
    Rules of overriding:
    1. access modifier must not be more restrictive than parent's
    2. returned type must be covariant with parent's returned type
    3. method signature must be the same
     */
    @Override
    public int addingB(int a) {
        return super.addingB(a);
    }

    @Override
    public OrnamentBox createBox() {
        return new OrnamentBox(20);
    }

}
