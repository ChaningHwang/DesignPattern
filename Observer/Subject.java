package Observer;

import java.util.*;

//Subject class, storing all observer subject in a list
//usually realized with an abstract class and interface
abstract class Subject {
    private List<Observer> observers = new ArrayList<Observer>();

    //adding observer
    public void Attach(Observer observer) {
        observers.add(observer);
    }

    //remove observer
    public void Detach(Observer observer) {
        observers.remove(observer);
    }

    //notify
    public void Notify() {
        for (Observer o:observers
             ) {
            o.Update();
        }
    }
}
