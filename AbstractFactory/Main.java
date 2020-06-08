package AbstractFactory;

//code for client side, test
public class Main {
    public static void main(String[] args) {
        User user = new User();
        Department dept = new Department();

        //only need one factory here, to decide which database to use
//        IFactory factory = new SqlServerFactory();
        IFactory factory = new AccessFactory();

        IUser iu = factory.CreateUser();

        iu.insert(user);
        iu.getUser(1);

        IDepartment id = factory.CreateDepartment();
        id.Insert(dept);
        id.GetDepartment(1);

        System.console();
    }
}
