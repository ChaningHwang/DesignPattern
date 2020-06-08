package AbstractFactory;

//implement IFactory interface, to realize the SqlserverUser and SqlserverDepartment
public class SqlServerFactory implements IFactory {
    public IUser CreateUser() {
        return new SqlserverUser();
    }

    public IDepartment CreateDepartment() {
        return new SqlserverDepartment();
    }
}
