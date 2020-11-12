public class EuropeClient implements IPurchaseDetails {
    @Override
    public float calculatePrice(Product product) {
        float price;
        price = (float) (product.getValue() * 1.3 + product.getWeight() * 0.15);
        return price;
    }
    @Override
    public int calculateShippingDuration(Product product) {
        int duration;
        duration = 7 + (int) (product.getWeight() * 0.1);
        return duration;
    }
    @Override
    public float calculateProfitMargin(Product product) {
        float profit = calculatePrice(product);
        profit = (float) (profit - product.getValue() - (product.getWeight() * 0.05));
        return profit;
    }
}
