import java.util.Date;

public abstract class Purchase {
    private String name;
    private Product product;
    private Date orderDate;
    private String client;

    public Purchase(String name, Product product, Date date, String client){
        this.name = name;
        this.product = product;
        this.orderDate = date;
        this.client = client;
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
        return calculatePrice(this.product);
    }

    public int getShippingDuration() {
        return calculateShippingDuration(this.product);
    }

    public float getProfitMargin() {
        return calculateProfitMargin(this.product);
    }

    public String getClient() {
        return client;
    }

    public abstract float calculatePrice(Product product);
    public abstract int calculateShippingDuration(Product product);
    public abstract float calculateProfitMargin(Product product);
}
