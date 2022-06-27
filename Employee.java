import java.util.ArrayList;
public class Employee {

    public String name;
    public int age;
    int salary;
    public  ArrayList<Employee> subordinates = new ArrayList<Employee>();

    public void addEmployee(Employee employee){
        this.subordinates.add(employee);
    }

    public  int recursiveMethod(Employee employee){
        int employeeAge = this.age;
        int employeeSalary = this.salary;
        int amountOfEmployees = 0;
        ArrayList<Employee>subordinate = employee.subordinates;

        for(int i=0; i < subordinate.size(); i++){
            if(employeeSalary > subordinate.get(i).salary && employeeAge < subordinate.get(i).age){
                amountOfEmployees+= 1;
            }

            amountOfEmployees+= recursiveMethod(subordinate.get(i));
        }
        return amountOfEmployees;

    }

    public static void main(String[] args){
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee();

        employee1.age = 25;
        employee2.age= 28;
        employee3.age= 27;
        employee1.salary= 1400;
        employee2.salary = 1300;
        employee3.salary = 1200;
        employee1.addEmployee(employee2);
        employee2.addEmployee(employee3);
        System.out.println(employee1.recursiveMethod(employee1));
    }

}