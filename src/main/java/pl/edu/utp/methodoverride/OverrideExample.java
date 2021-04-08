package pl.edu.utp.methodoverride;

public class OverrideExample {

    public static void main(String[] args) {
        Parent p = new Parent();
        p.displayA();

        Child c = new Child();
        c.displayA();
        c.generateRandom();

        Parent cAsP = c;
        cAsP.displayA();

        Box box = p.createBox();
        System.out.println(box.getSize());
        OrnamentBox oBox = c.createBox();
        System.out.println(oBox.getSize());
        Box box2 = cAsP.createBox();
        System.out.println(box2.getSize());
    }

}
