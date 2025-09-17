import java.util.*;

public class Company {
    private ArrayList<Employee> employees = new ArrayList<>();

    public void add(Employee e){
        // TODO: prevent duplicate id; else throw IllegalArgumentException
        throw new UnsupportedOperationException("TODO");
    }

    public Employee richest(){
        // TODO: return employee with highest getPayment() (null if empty)
        throw new UnsupportedOperationException("TODO");
    }

    public void raiseAll(double pct){
        // TODO: call raiseByPercent on all employees
        throw new UnsupportedOperationException("TODO");
    }

    public int size(){ return employees.size(); }
}
