package AbstractFactory;

public class AccessUser implements IUser {
    @Override
    public void insert(User user) {
        System.out.println("add a record in user table in Access");
    }

    @Override
    public User getUser(int id) {
        System.out.println("get a record in User table in Access");
        return null;
    }
}
