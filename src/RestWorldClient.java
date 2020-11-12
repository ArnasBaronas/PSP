public class RestWorldClient implements IPurchaseDetails {
    @Override
    public float calculatePrice(Product product) {
        float price;
        price = (float) (product.getValue() * 1.25 + product.getWeight() * 0.35);
        return price;
    }
    @Override
    public int calculateShippingDuration(Product product) {
        int duration;
        duration = 14 + (int) (product.getWeight() * 0.2);
        return duration;
    }
    @Override
    public float calculateProfitMargin(Product product) {
        float profit = calculatePrice(product);
        profit = (float) (profit - product.getValue() - (product.getWeight() * 0.1));
        return profit;
    }
}
