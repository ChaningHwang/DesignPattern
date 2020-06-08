package Observer;

//to store relative states into concrete subject
//when sth change internally, notify all subscribed observers.
public class ConcreteSubject extends Subject {
    private String subjectState;
    //Concrete observed state

    public void SetSubjectState(String value) {
        this.subjectState = value;
    }

    public String GetSubjectState() {
        return subjectState;
    }
}
