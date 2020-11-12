import java.util.Date;

public class LeasePurchaseLocalClient extends LeasePurchase {

    public LeasePurchaseLocalClient(int number, Product product, Date date, String client, int duration, int clientCreditScore){
        super(number, product, date, client, duration, clientCreditScore);
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
