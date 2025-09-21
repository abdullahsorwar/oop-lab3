import java.util.*;

public class ParkingLot {
    private HashMap<String, Vehicle> parked = new HashMap<>(); // plate -> vehicle
    private double revenue = 0.0;

    public boolean park(Vehicle v){
        // TODO: if already parked, return false; else add and return true
        if (parked.containsKey(v.getPlate())) {
            return false;
        } else {
            parked.put(v.getPlate(), v);
            return true;
        }
        // throw new UnsupportedOperationException("TODO");
    }

    public double leave(String plate, long exitTime){
        // TODO: compute hours (ceil to next hour if any fraction), fee = hours * rate
        // Remove from map, add to revenue, return fee
        // If not found, return -1
        if (!parked.containsKey(plate)) {
            return -1;
        }
        else {
            Vehicle v = parked.remove(plate);
            long duration = exitTime - v.getEntryTime();
            int hours = (int) Math.ceil(duration / 3600.0);
            double fee = hours * v.ratePerHour();
            revenue += fee;
            return fee;
        }
        // throw new UnsupportedOperationException("TODO");
    }

    public double getRevenue(){ return revenue; }
    public int getOccupancy(){ return parked.size(); }
}
