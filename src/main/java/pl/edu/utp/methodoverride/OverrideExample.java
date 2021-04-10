package pl.edu.utp.methodoverride;

public class OverrideExample {

    public static void main(String[] args) {
        // lets create a parent
        Parent p = new Parent();
        p.displayA();

        // and now a child
        Child c = new Child();
        // child has access to parents methods and is also able to override them
        c.displayA();
        // has it's own methods too
        c.generateRandom();

        // but if we reference the child from parent's perspective...
        Parent cAsP = c;
        // we can still access methods defined in the parent (with result provided as defined in the child class)
        cAsP.displayA();
        // but no longer have access to child's methods (rules of polymorphism)
        // cAsP.generateRandom(); - compilation error

        // parents creates box
        Box box = p.createBox();
        System.out.println(box.getSize());
        // child creates ornament box
        OrnamentBox oBox = c.createBox();
        System.out.println(oBox.getSize());
        // even though we reference child as parent...
        Box box2 = cAsP.createBox();
        // ...when we ask for box, we still get the ornament one :)
        System.out.println(box2.getSize());
    }

}
