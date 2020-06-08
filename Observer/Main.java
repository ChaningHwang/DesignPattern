package Observer;

//code for client side
public class Main {
    public static void main(String[] args) {
        ConcreteSubject s = new ConcreteSubject();

        s.Attach(new ConcreteObserver(s, "X"));
        s.Attach(new ConcreteObserver(s, "Y"));
        s.Attach(new ConcreteObserver(s, "Z"));

        s.SetSubjectState("ABC");
        s.Notify();

        System.console();
    }
}
