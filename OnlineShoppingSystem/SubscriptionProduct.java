package OnlineShoppingSystem;

public class SubscriptionProduct extends Product {

    private int durationOfSubscription;
    private double discount = 0.05 ; // 5% discount
    private double totalCost;

    public SubscriptionProduct(int productId, String productName, double price, int durationOfSubscription){
        super(productId, productName, price);
        this.durationOfSubscription = durationOfSubscription;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("The Subscription duration (in months) of " + super.getProductName() + " is: " + durationOfSubscription);    
    }

    public void calculatePrice(){
        totalCost = (super.getPrice() - (super.getPrice() * discount)) * durationOfSubscription ;
        System.out.println("The Discount applied is : " + (super.getPrice() * discount * durationOfSubscription));

        System.out.println("The total cost will be : " + totalCost);

    }

}

