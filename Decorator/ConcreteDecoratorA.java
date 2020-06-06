package Decorator;

public class ConcreteDecoratorA extends Decorator {
    private String addedState;
    @Override
    public void Operation() {
        super.Operation();
        addedState = "New State";
        System.out.println("Operation for concrete decorator A");
    }
}
