public class Manager extends Employee {
    private double base;
    private double bonus;
    public Manager(String id, String name, double base, double bonus){
        super(id, name); this.base = base; this.bonus = bonus;
    }
    @Override public double getPayment(){ return base + bonus; }
    @Override public void raiseByPercent(double pct){
        // TODO: increase base and bonus by pct%
        base += base * pct / 100.0;
        bonus += bonus * pct / 100.0;
        return;
        // throw new UnsupportedOperationException("TODO");
    }
}
