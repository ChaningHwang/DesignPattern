package Adapter;

//to encapsulate a object, change original target to specific target
public class Adapter extends Target {
    //create a private adaptee object
    private Adaptee adaptee = new Adaptee();

    //change request to specific request
    @Override
    public void Request() {
        adaptee.SpecificRequest();
    }
}
