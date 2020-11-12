import java.util.Date;

public class LeasePurchase {
    private int number;
    private Product product;
    private Date orderDate;
    private IPurchaseDetails purchaseDetails;
    private String client;
    private int contractDuration;
    private int clientCreditScore;

    public LeasePurchase(int number, Product product, Date date, String client, int duration, int clientCreditScore){
        this.number = number;
        this.product = product;
        this.orderDate = date;
        this.client = client;
        this.contractDuration = duration;
        this.clientCreditScore = clientCreditScore;
        if(client.equals("Local")) {
            this.purchaseDetails = new LocalClient();
        }
        else if (client.equals("European")) {
            this.purchaseDetails = new EuropeClient();
        }
        else {
            this.purchaseDetails = new RestWorldClient();
        }
        this.purchaseDetails = purchaseDetails;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public int getNumber() {
        return number;
    }

    public Product getProduct() {
        return product;
    }

    public float getPrice() {
        return purchaseDetails.calculatePrice(this.product);
    }

    public int getShippingDuration() {
        return purchaseDetails.calculateShippingDuration(this.product);
    }

    public float getProfitMargin() {
        return purchaseDetails.calculateProfitMargin(this.product);
    }

    public String getClient() {
        return client;
    }

    public int getContractDuration() {
        return contractDuration;
    }

    public float getClientCreditScore() {
        return clientCreditScore;
    }

    public float getMonthlyPayment() {
        return (float) ((getPrice() * (1.02 + 0.01 * getRisk()) + 30) / contractDuration);
    }

    public float getRisk() {
        return (float) (-0.5 * (Math.log(clientCreditScore * 0.001) / Math.log(1.1)));
    }

    public int getOverdueTerm() {
        return (int) (10 - getRisk());
    }
}