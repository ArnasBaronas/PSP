import java.util.Date;

public class PurchaseLocalsClient extends Purchase {

    public PurchaseLocalsClient(String name, Product product, Date date, String client){
        super(name, product, date, client);
    }

    @Override
    public float calculatePrice(Product product) {
        float price;
        price = (float) (product.getValue() * 1.1 + product.getWeight() * 0.1);
        return price;
    }
    @Override
    public int calculateShippingDuration(Product product) {
        return 7;
    }
    @Override
    public float calculateProfitMargin(Product product) {
        float profit = calculatePrice(product);
        profit = profit - product.getValue() - 5;
        return profit;
    }
}
