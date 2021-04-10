package pl.edu.utp.methodoverrload;

public class OverloadExample {

    public static void main(String[] args) {
        // we can overload all kinds of methods (even constructors)
        Toolset t = new Toolset(100, 10);
        t.describe();
        Toolset t2 = new Toolset(10);
        t2.describe();
        // this way we can easily provide default parameters, if needed
        Toolset t3 = new Toolset();
        t3.describe();

        // overloaded methods can have different access modifiers, keywords or returned types
        t.getTool();
        t.getTool(1);

        // this technique can also be used for developers convenience (support of different parameters using one method name)
        System.out.println(false);
        System.out.println(1);
        System.out.println("ash");
        System.out.println(new Object());

    }

}
