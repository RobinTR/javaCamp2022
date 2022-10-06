public class Main {
    public static void main(String[] args) {

        Customer customer = new Customer();
        Employee employee = new Employee();
        employee.id = 1;
        employee.salary = 15000;
        customer.id = 2;
        customer.email = "test@test.com";

        EmployeeManager employeeManager = new EmployeeManager();
        CustomerManager customerManager = new CustomerManager();
        employeeManager.add();
        employeeManager.bestEmployee();
        customerManager.add();


    }
}