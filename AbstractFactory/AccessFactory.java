package AbstractFactory;

//implement the IFactory interface, to realize the AccessUser and AccessDepartment
public class AccessFactory implements IFactory {
    public IUser CreateUser() {
        return new AccessUser();
    }

    public IDepartment CreateDepartment() {
        return new AccessDepartment();
    }
}
