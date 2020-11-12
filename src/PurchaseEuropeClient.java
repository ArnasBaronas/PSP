import java.util.Date;

public class PurchaseEuropeClient extends Purchase {

    public PurchaseEuropeClient(String name, Product product, Date date, String client){
        super(name, product, date, client);
    }

    @Override
    public float getPrice() {
        float price;
        price = (float) (super.getProduct().getValue() * 1.3 + super.getProduct().getWeight() * 0.15);
        return price;
    }
    @Override
    public int getShippingDuration() {
        //super.getProduct()
        int duration;
        duration = 7 + (int) (super.getProduct().getWeight() * 0.1);
        return duration;
    }
    @Override
    public float getProfitMargin() {
        float profit = getPrice();
        profit = (float) (profit - super.getProduct().getValue() - (super.getProduct().getWeight() * 0.05));
        return profit;
    }
}
