package pl.edu.utp.baseobject;

public class ToStringExample {

    public static void main(String[] args) {
        // each object has toString() method to provide text-based description
        Object obj = new Object();
        String objToString = obj.toString();
        System.out.println(objToString);

        Table table1 = new Table(2, 4, 6);
        System.out.println(table1);

        Table table2 = new Table("glass", 1, 1, 2, 2);
        System.out.println(table2);
    }

}
