package Memento;

public class Main {
    public static void main(String[] args) {
        //original state
        Originator o = new Originator();
        o.setState("On");
        o.Show();

        Caretaker c = new Caretaker();
        c.setMemento(o.CreateMemento());

        //change state to off
        o.setState("off");
        o.Show();

        //restore to original state
        o.SetMemento(c.getMemento());
        o.Show();

        System.console();
    }
}
