import java.util.Date;

public class LeasePurchaseLocalBusinessClient extends LeasePurchase {

    public LeasePurchaseLocalBusinessClient(int number, Product product, Date date, String client, int duration, int clientCreditScore){
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
    @Override
    public float getMonthlyPayment() {
        return (float) ((getPrice() * (1.02 + 0.01 * getRisk()) + 30) / super.getContractDuration());
    }
    @Override
    public float getRisk() {
        return (float) (-0.5 * (Math.log(super.getClientCreditScore() * 0.001) / Math.log(1.1)));
    }
    @Override
    public int getOverdueTerm() {
        return (int) (10 - getRisk());
    }
}
