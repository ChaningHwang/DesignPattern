package State;

//to implement a relative action with context
public class ConcreteStateA extends State {
    //to set the next state of ConcreteStateA is ConcreteStateB
    @Override
    public void Handle(Context context) {
        context.setState(new ConcreteStateB());
    }
}
