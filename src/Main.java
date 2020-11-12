import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Product exampleProduct = new Product("Example product", 400, (float) 0.05, 70);
        System.out.println("New Product was entered");

        Purchase firstPurchase = new Purchase("O-001", exampleProduct, Calendar.getInstance().getTime(), "Local");
        System.out.println(firstPurchase.getClient() + " origin order " + firstPurchase.getName() + " was entered");
        System.out.println("Order " + firstPurchase.getName() + " price - " + firstPurchase.getPrice() + "Eur");
        System.out.println("Order " + firstPurchase.getName() + " shipping duration - " + firstPurchase.getShippingDuration() + " days");
        System.out.println("Order " + firstPurchase.getName() + " profit margin - " + firstPurchase.getProfitMargin() + " Eur");
        System.out.println("___________________________________________");

        Purchase secondPurchase = new Purchase("O-002", exampleProduct, Calendar.getInstance().getTime(),"European");
        System.out.println(secondPurchase.getClient() + " origin order " + secondPurchase.getName() + " was entered");
        System.out.println("Order " + secondPurchase.getName() + " price - " + secondPurchase.getPrice() + "Eur");
        System.out.println("Order " + secondPurchase.getName() + " shipping duration - " + secondPurchase.getShippingDuration() + " days");
        System.out.println("Order " + secondPurchase.getName() + " profit margin - " + secondPurchase.getProfitMargin() + " Eur");
        System.out.println("___________________________________________");

        Purchase thirdPurchase = new Purchase("O-003", exampleProduct, Calendar.getInstance().getTime(), "Rest of the world");
        System.out.println(thirdPurchase.getClient() + " origin order " + thirdPurchase.getName() + " was entered");
        System.out.println("Order " + thirdPurchase.getName() + " price - " + thirdPurchase.getPrice() + "Eur");
        System.out.println("Order " + thirdPurchase.getName() + " shipping duration - " + thirdPurchase.getShippingDuration() + " days");
        System.out.println("Order " + thirdPurchase.getName() + " profit margin - " + thirdPurchase.getProfitMargin() + " Eur");
        System.out.println("___________________________________________");

        LeasePurchase fourthPurchase = new LeasePurchase(1, exampleProduct, Calendar.getInstance().getTime(), "Local", 6, 669);
        System.out.println(fourthPurchase.getClient() + " origin order " + fourthPurchase.getNumber() + " was entered");
        System.out.println("Order " + fourthPurchase.getNumber() + " price - " + fourthPurchase.getPrice() + "Eur");
        System.out.println("Order " + fourthPurchase.getNumber() + " shipping duration - " + fourthPurchase.getShippingDuration() + " days");
        System.out.println("Order " + fourthPurchase.getNumber() + " profit margin - " + fourthPurchase.getProfitMargin() + " Eur");
        System.out.println("Order " + fourthPurchase.getNumber() + " monthly payment - " + fourthPurchase.getMonthlyPayment() + " Eur");
        System.out.println("Order " + fourthPurchase.getNumber() + " not paying risk - " + fourthPurchase.getRisk() + " %");
        System.out.println("Order " + fourthPurchase.getNumber() + " overdue term - " + fourthPurchase.getOverdueTerm() + " days");
        System.out.println("___________________________________________");
        
    }
}
