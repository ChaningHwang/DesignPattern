package TemplateMethod;

public class ConcreteClassB extends AbstractClass {
    @Override
    public void PrimitiveOperation1() {
        System.out.println("Concrete realization B of 1");
    }
    @Override
    public void PrimitiveOperation2() {
        System.out.println("Concrete realization B of 2");
    }
}
