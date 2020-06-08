package AbstractFactory;

//used to access the department table in SQL Server
public class SqlserverDepartment implements IDepartment {
    public void Insert(Department department) {
        System.out.println("add a record in department in SQL Server");
    }

    public Department GetDepartment(int id) {
        System.out.println("get a record by id in department in SQL Server");
        return null;
    }
}
