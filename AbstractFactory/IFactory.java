package AbstractFactory;

//define an factory interface to create subject in User table
interface IFactory {
    IUser CreateUser();
    IDepartment CreateDepartment();
}

