package pl.edu.utp.methodoverride;

public class Parent {

    private String a = "abc";
    protected int b = 10;

    /* since we haven't specified any explicit constructor, compiler adds an default implicit constructor for us

    public Parent() {
        super();
    }
     */

    protected int getB() {
        return b;
    }

    public void displayA() {
        System.out.println(a);
    }

    protected int addingB(int a) {
        return a + b;
    }

    public Box createBox() {
        return new Box(10);
    }

}
