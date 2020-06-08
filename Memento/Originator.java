package Memento;

public class Originator {
    private String state;

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public Memento CreateMemento() {
        return (new Memento(state));
    }

    public void SetMemento(Memento memento) {
        state = memento.getState();
    }

    public void Show() {
        System.out.println("State = " + state);
    }
}
