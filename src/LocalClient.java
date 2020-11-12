public class LocalClient implements IPurchaseDetails {
    @Override
    public float calculatePrice(Product product) {
        float price;
        price = (float) (product.getValue() * 1.1 + product.getWeight() * 0.1);
        return price;
    }
    @Override
    public int calculateShippingDuration(Product product) {
        return 7;
    }
    @Override
    public float calculateProfitMargin(Product product) {
        float profit = calculatePrice(product);
        profit = profit - product.getValue() - 5;
        return profit;
    }
}
