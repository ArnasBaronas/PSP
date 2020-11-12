import java.util.Date;

public class LeasePurchaseRestWorldClient extends LeasePurchase {

    public LeasePurchaseRestWorldClient(int number, Product product, Date date, String client, int duration, int clientCreditScore){
        super(number, product, date, client, duration, clientCreditScore);
    }

    @Override
    public float getPrice() {
        float price;
        price = (float) (super.getProduct().getValue() * 1.25 + super.getProduct().getWeight() * 0.35);
        return price;
    }
    @Override
    public int getShippingDuration() {
        int duration;
        duration = 14 + (int) (super.getProduct().getWeight() * 0.2);
        return duration;
    }
    @Override
    public float getProfitMargin() {
        float profit = getPrice();
        profit = (float) (profit - super.getProduct().getValue() - (super.getProduct().getWeight() * 0.1));
        return profit;
    }
}
