import java.util.ArrayList;
import java.util.List;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

interface Employee {
    public int getId();

    public String getName();

    public float getSalary();

    public void add(Employee employee);

    public void remove(Employee employee);

    public Employee getChildEmployee(int n);
}

class BankManager implements Employee {
    String name;
    int id;
    float salary;
    List<Employee> employees = new ArrayList<>();

    public BankManager(int id, String name, float salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public float getSalary() {
        return this.salary;
    }

    @Override
    public void add(Employee employee) {
        employees.add(employee);
    }

    @Override
    public void remove(Employee employee) {
        employees.remove(employee);
    }

    @Override
    public Employee getChildEmployee(int n) {
        return (employees.get(n));
    }

}

class Cashier implements Employee {
    int id;
    String name;
    float salary;

    Cashier(int id, String name, float salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public float getSalary() {
        return this.salary;
    }

    @Override
    public void add(Employee employee) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

    @Override
    public void remove(Employee employee) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }

    @Override
    public Employee getChildEmployee(int n) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getChildEmployee'");
    }

}

public class Composite {
    public static void main(String[] args) {
        Employee employee = new BankManager(1, "Kiran Vellanki", 3900000);
        Cashier cashier = new Cashier(2, "abc", 13422);
        employee.add(cashier);
        System.out.println(employee.getChildEmployee(0).getName());
        System.out.println(employee.getId());
    }
}
