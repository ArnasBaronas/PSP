public class RentDetailsForIndividuals implements IRentDetails {
    public float calculateMonthlyPayment(float risk, float price, int contractDuration) {
        return (float) ((price * (1.03 + 0.01 * risk) + 30) / contractDuration);
    }

    public float calculateRisk(int clientCreditScore) {
        return (float) (-0.5 * (Math.log(clientCreditScore * 0.001) / Math.log(1.05)));
    }

    public int calculateOverdueTerm(Product product, int clientCreditScore) {
        return (int) (10 + calculateRisk(clientCreditScore));
    }
}
