package State;

public class ConcreteStateB extends State {
    //to set the next state of ConcreteStateA is ConcreteStateB
    @Override
    public void Handle(Context context) {
        context.setState(new ConcreteStateA());
    }
}
