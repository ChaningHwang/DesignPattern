package AbstractFactory;

public class Department {
    private int ID;
    private String DepartmentName;

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getID() {
        return ID;
    }

    public void setDepartmentName(String DepartmentName) {
        this.DepartmentName = DepartmentName;
    }

    public String getDepartmentName() {
        return DepartmentName;
    }
}
