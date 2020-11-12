import java.util.Date;

public class PurchaseLocalClient extends Purchase {

    public PurchaseLocalClient(String name, Product product, Date date, String client){
        super(name, product, date, client);
    }

    @Override
    public float getPrice() {
        float price;
        price = (float) (getProduct().getValue() * 1.1 + getProduct().getWeight() * 0.1);
        return price;
    }
    @Override
    public int getShippingDuration() {
        return 7;
    }
    @Override
    public float getProfitMargin() {
        float profit = getPrice();
        profit = profit - getProduct().getValue() - 5;
        return profit;
    }
}
