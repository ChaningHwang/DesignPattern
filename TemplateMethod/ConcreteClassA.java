package TemplateMethod;

public class ConcreteClassA extends AbstractClass {
    @Override
    public void PrimitiveOperation1() {
        System.out.println("Concrete realization A of 1");
    }
    @Override
    public void PrimitiveOperation2() {
        System.out.println("Concrete realization A of 2");
    }
}
