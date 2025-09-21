import java.util.*;

public class ShoppingCart {
    private ArrayList<Product> items = new ArrayList<>();
    private double discountPercent = 0.0; // 0..100

    public void addProduct(Product p){
        // TODO: add product to list
        items.add(p);
        // throw new UnsupportedOperationException("TODO");
    }

    public boolean removeProductById(int id){
        // TODO: remove first product with id; return true if removed
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getId() == id) {
                items.remove(i);
                return true;
            }
        }
        return false;
        // throw new UnsupportedOperationException("TODO");
    }

    public void applyDiscount(double percent){
        // TODO: set discountPercent (0..90 inclusive), else throw IllegalArgumentException
        if (percent < 0 || percent > 90) {
            throw new IllegalArgumentException("Discount percent must be between 0 and 90 inclusive.");
        }
        this.discountPercent = percent;
        return;
        // throw new UnsupportedOperationException("TODO");
    }

    public double getTotalCost(){
        // TODO: sum of prices minus percent discount
        double total = 0.0;
        for (Product p : items) {
            total += p.getPrice();
        }
        total = total * (1 - discountPercent / 100);
        return total;
        // throw new UnsupportedOperationException("TODO");
    }

    public int size(){ return items.size(); }
}
