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

    public abstract float getPrice();
    public abstract int getShippingDuration();
    public abstract float getProfitMargin();

    public Date getOrderDate() {
        return orderDate;
    }

    public String getName() {
        return name;
    }

    public Product getProduct() {
        return product;
    }

    public String getClient() {
        return client;
    }
}
