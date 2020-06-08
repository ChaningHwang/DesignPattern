package State;

//used to maintain a concrete example of ConcreteState's child
// used to define current state
public class Context {
    private State state;
    //to initialize the context state
    public Context(State state) {
        this.state = state;
    }

    public void setState(State value) {
        this.state = value;
        String str = String.format("Current state is: %s", state.getClass().getName());
        System.out.println(str);
    }

    public State getState() {
        return state;
    }

    //ask for handle, to set next state
    public void Request() {
        this.state.Handle(this);
    }
}
