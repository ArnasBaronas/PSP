public interface IRentDetails {
    public float calculateMonthlyPayment(float risk, float price, int contractDuration);
    public float calculateRisk(int clientCreditScore);
    public int calculateOverdueTerm(Product product, int clientCreditScore);
}
