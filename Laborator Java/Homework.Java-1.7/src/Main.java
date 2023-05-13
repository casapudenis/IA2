import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Company Caphyon =new Company("Caphyon",new Address("Craiova","Sfantu Dumitru",8));
        Company Nagarro =new Company("Nagarro",new Address("Craiova","13 Septembrie",13));

        Employee first_employee = new Employee("Grosu Claudia Mihaela",new Address("Craiova","Calea Bucuresti",7));
        Employee second_employee = new Employee("Casapu Denis Cristian",new Address("Craiova","Henri Coanda",68));

        Nagarro.addEmployees(first_employee);
        Nagarro.addEmployees(second_employee);
        System.out.println("Employees of Nagarro");
        Nagarro.printEmployeesName();
        Nagarro.removeEmployees(second_employee);
        System.out.println("Employees of Nagarro after the removal");
        Nagarro.printEmployeesName();
        Caphyon.moveEmployees(Nagarro,first_employee);
        System.out.println("Employees of Caphyon");
        Caphyon.printEmployeesName();
        System.out.println("Employees of Nagarro");
        Nagarro.printEmployeesName();
    }
}