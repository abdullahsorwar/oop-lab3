import java.util.*;

public class Company {
    private ArrayList<Employee> employees = new ArrayList<>();

    public void add(Employee e){
        // TODO: prevent duplicate id; else throw IllegalArgumentException
        for (Employee employee : employees) {
            if (employee.getId().equals(e.getId())) {
                throw new IllegalArgumentException("Duplicate ID!");
            }
        }
        employees.add(e);
        return;
        // throw new UnsupportedOperationException("TODO");
    }

    public Employee richest(){
        // TODO: return employee with highest getPayment() (null if empty)
        int n = size();
        if (n == 0) return null;
        Employee richest = employees.get(0);
        for (int i = 1; i < n; i++) {
            if (employees.get(i).getPayment() > richest.getPayment()) {
                richest = employees.get(i);
            }
        }
        return richest;
        // throw new UnsupportedOperationException("TODO");
    }

    public void raiseAll(double pct){
        // TODO: call raiseByPercent on all employees
        for (Employee employee : employees) {
            employee.raiseByPercent(pct);
        }
        // throw new UnsupportedOperationException("TODO");
    }

    public int size(){ return employees.size(); }
}
