package AbstractFactory;

public class SqlserverUser implements IUser {
    @Override
    public void insert(User user) {
        System.out.println("add a record in User in SQL server");
    }

    @Override
    public User getUser(int id) {
        System.out.println("get a record by id in User table in SQL server");
        return null;
    }
}
