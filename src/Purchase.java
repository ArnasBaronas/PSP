import java.util.Date;

public class Purchase {
    private String name;
    private Product product;
    private Date orderDate;
    private IPurchaseDetails purchaseDetails;
    private String client;

    public Purchase(String name, Product product, Date date, String client){
        this.name = name;
        this.product = product;
        this.orderDate = date;
        this.client = client;
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

    public String getName() {
        return name;
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
}
