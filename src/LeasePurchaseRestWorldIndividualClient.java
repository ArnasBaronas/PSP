import java.util.Date;

public class LeasePurchaseRestWorldIndividualClient extends LeasePurchase {

    public LeasePurchaseRestWorldIndividualClient(int number, Product product, Date date, String client, int duration, int clientCreditScore){
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
    @Override
    public float getMonthlyPayment() {
        return (float) ((getPrice() * (1.03 + 0.01 * getRisk()) + 30) / super.getContractDuration());
    }
    @Override
    public float getRisk() {
        return (float) (-0.5 * (Math.log(super.getClientCreditScore() * 0.001) / Math.log(1.05)));
    }
    @Override
    public int getOverdueTerm() {
        return (int) (10 + getRisk());
    }
}
