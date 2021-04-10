package pl.edu.utp.methodoverride;

public class OrnamentBox extends Box {

    /*
    default implicit constructor won't be sufficient anymore since superclass has defined explicit constructor different
    from default (with args) - compiler doesn't know how to call it
    we need to declare another explicit constructor that will properly call the superclasses constructor
     */

    /*
    1. delegate example - create constructor with similar signature and simply pass all the fields through
     */
    public OrnamentBox(int size) {
        super(size);
    }

    /*
    2. default value example - create default constructor that provides default values to parent
     */
    public OrnamentBox() {
        super(10);
    }

    /*
    both constructors may co-exist due to overloading :)
     */

}
