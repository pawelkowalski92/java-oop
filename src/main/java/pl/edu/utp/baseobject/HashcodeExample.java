package pl.edu.utp.baseobject;

import java.util.HashMap;
import java.util.Map;

public class HashcodeExample {

    public static void main(String[] args) {
        // create "DB"
        Map<Table, String> orders = new HashMap<>();

        // create table and order
        Table circleTable = new Table(1, 1, 1);
        String orderId = "abc";

        // put them in the DB
        orders.put(circleTable, orderId);

        // get order for circle table (from different component)
        String myOrder = findOrderIdForCircleTable(orders);

        // if hashCode() is properly implemented, then order is found
        System.out.println("My order: " + myOrder);
    }

    // imagine different component
    static String findOrderId(Map<Table, String> orders, Table table) {
        return orders.get(table);
    }

    // imagine another different component
    static String findOrderIdForCircleTable(Map<Table, String> orders) {
        Table circleTable = new Table(1, 1, 1);
        return findOrderId(orders, circleTable);
    }

}
