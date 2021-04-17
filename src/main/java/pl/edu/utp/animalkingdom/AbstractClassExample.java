package pl.edu.utp.animalkingdom;

import pl.edu.utp.animalkingdom.mammals.Cat;
import pl.edu.utp.animalkingdom.mammals.Human;

public class AbstractClassExample {

    public static void main(String[] args) {
        Human steve = new Human();
        steve.setLegCount(2);
        steve.setWeight(70.5);
        steve.setName("Steve");

        System.out.println(steve);
        steve.eat("salad");

        Cat mitten = new Cat(true);
        mitten.setLegCount(4);
        mitten.setWeight(9.3);
        mitten.setName("Mitten");
        mitten.setOwner(steve);

        mitten.eat("fish");
        mitten.eat("book");
        mitten.eat("caesar salad");
    }

}
