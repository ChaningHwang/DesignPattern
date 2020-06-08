package Prototype;

public class ConcretePrototype1 extends Prototype implements Cloneable{
    public ConcretePrototype1(String id) {
        super(id);
    }

    @Override
    public Prototype Clone() {
        Prototype prototype = null;
        try {
            prototype = (Prototype) clone();
        }
        catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return prototype;
    }
}
