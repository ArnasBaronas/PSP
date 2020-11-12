public interface IPurchaseDetails {
    public float calculatePrice(Product product);
    public int calculateShippingDuration(Product product);
    public float calculateProfitMargin(Product product);
}
