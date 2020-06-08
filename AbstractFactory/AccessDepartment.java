package AbstractFactory;

//used to access Department table in Access
public class AccessDepartment implements IDepartment {
    public void Insert(Department department) {
        System.out.println("add a record in Access");
    }

    public Department GetDepartment(int id) {
        System.out.println("get a record by id in Access");
        return null;
    }
}
