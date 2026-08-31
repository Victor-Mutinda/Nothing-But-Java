package OnlineShoppingSystem;

public class PhysicalProduct extends Product {
    private double shippingCost;
    private double finalPrice;

    public PhysicalProduct(int productId, String productName, double price, double shippingCost){
        super(productId, productName, price); // Inheritance. Reusing parent constructor
        this.shippingCost = shippingCost;     

    }
    // Polymorphism through method overriding
    @Override // This changes the behaviour of the method
    public void displayInfo(){ 
        super.displayInfo(); // This uses the parent implementation of the method.
        System.out.println("The shipping cost is : " + shippingCost);
    }

    @Override
    public void calculatePrice(int quantity){
        finalPrice = shippingCost + (super.getPrice() * quantity);
        System.out.println("The Total cost of " + quantity + " " + super.getProductName() + " is : " + finalPrice);
    } 



}
