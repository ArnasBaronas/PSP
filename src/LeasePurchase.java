import java.util.Date;

public class LeasePurchase {
    private int number;
    private Product product;
    private Date orderDate;
    private IPurchaseDetails purchaseDetails;
    private IRentDetails rentDetails;
    private String client;
    private int contractDuration;
    private int clientCreditScore;

    public LeasePurchase(int number, Product product, Date date, String client, int duration, int clientCreditScore, boolean businessClient){
        this.number = number;
        this.product = product;
        this.orderDate = date;
        this.client = client;
        this.contractDuration = duration;
        this.clientCreditScore = clientCreditScore;
        if(businessClient) {
            this.rentDetails = new RentDetailsForBusiness();
        }
        else {
            this.rentDetails = new RentDetailsForIndividuals();
        }
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

    public int getClientCreditScore() {
        return clientCreditScore;
    }

    public float getMonthlyPayment() {
        return rentDetails.calculateMonthlyPayment(getRisk(), getPrice(), getContractDuration());
    }

    public float getRisk() {
        return rentDetails.calculateRisk(clientCreditScore);
    }

    public int getOverdueTerm() {
        return rentDetails.calculateOverdueTerm(product, clientCreditScore);
    }
}