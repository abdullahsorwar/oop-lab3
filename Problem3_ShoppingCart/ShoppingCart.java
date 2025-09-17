import java.util.*;

public class ShoppingCart {
    private ArrayList<Product> items = new ArrayList<>();
    private double discountPercent = 0.0; // 0..100

    public void addProduct(Product p){
        // TODO: add product to list
        throw new UnsupportedOperationException("TODO");
    }

    public boolean removeProductById(int id){
        // TODO: remove first product with id; return true if removed
        throw new UnsupportedOperationException("TODO");
    }

    public void applyDiscount(double percent){
        // TODO: set discountPercent (0..90 inclusive), else throw IllegalArgumentException
        throw new UnsupportedOperationException("TODO");
    }

    public double getTotalCost(){
        // TODO: sum of prices minus percent discount
        throw new UnsupportedOperationException("TODO");
    }

    public int size(){ return items.size(); }
}
