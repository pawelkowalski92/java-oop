package pl.edu.utp.methodoverride;

public class Box {

    int size;

    /*
    if explicit constructor is present, then compiler doesn't create any
     */
    public Box(int size) {
        /*
        compiler will only add the call to the superclass constructor, if missing
        super();
         */
        this.size = size;
    }

    public int getSize() {
        return size;
    }

}
