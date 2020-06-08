package State;

//define an interface to encapsulate a relative action with Context
abstract class State {
    public abstract void Handle(Context context);
}
