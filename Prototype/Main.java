package Prototype;

public class Main {
    public static void main(String[] args) {
        ConcretePrototype1 p1 = new ConcretePrototype1("I");
        ConcretePrototype1 c1 = (ConcretePrototype1)p1.Clone();
        String str = String.format("id: %s", c1.getId());
        System.out.println(str);
    }
}
