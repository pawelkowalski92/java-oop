package pl.edu.utp.baseobject;

public class EqualsExample {

    public static void main(String[] args) {
        Object a = new Object();
        Object b = new Object();
        Object c = a;

        System.out.println("Is equal? (a == b): " + a.equals(b));
        System.out.println("Is equal? (a == c): " + a.equals(c));
        System.out.println("Is equal? (b == b): " + b.equals(b));

        Table t1 = new Table("wood", 4, 1.5, 2.5, 3.5);
        Table t2 = new Table(1.5, 2.5, 3.5);
        Table t3 = new Table("glass", 1, 1.5, 2.5, 3.5);
        Table t4 = new Table("wood", 4, 1.5, 2.5, 3.5);

        System.out.println("Is equal? (t1 == t2): " + t1.equals(t2));
        System.out.println("Is equal? (t1 == t3): " + t1.equals(t3));
        System.out.println("Is equal? (t2 == t2): " + t2.equals(t2));
        System.out.println("Is equal? (t1 == t4): " + t1.equals(t4)); //true?

    }

}
