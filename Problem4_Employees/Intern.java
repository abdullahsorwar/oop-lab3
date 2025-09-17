public class Intern extends Employee {
    private double stipend;
    public Intern(String id, String name, double stipend){
        super(id, name); this.stipend = stipend;
    }
    @Override public double getPayment(){ return stipend; }
    @Override public void raiseByPercent(double pct){
        // TODO: increase stipend by pct%
        throw new UnsupportedOperationException("TODO");
    }
}
