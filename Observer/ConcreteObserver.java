package Observer;

//realize the update interface needed in abstract observer
public class ConcreteObserver extends Observer {
    private String name;
    private String observerState;
    private ConcreteSubject subject;

    public ConcreteObserver(ConcreteSubject subject, String name) {
        this.subject = subject;
        this.name = name;
    }

    @Override
    public void Update() {
        observerState = subject.GetSubjectState();
        String format = String.format("observer %s 's state is %s", name, observerState);
        System.out.println(format);
    }

    public void setSubject(ConcreteSubject subject) {
        this.subject = subject;
    }
    public ConcreteSubject getSubject() {
        return subject;
    }
}
