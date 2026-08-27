package OnlineShoppingSystem;

public class DigitalProduct extends Product{

    private double fileSize;
    private double discount =  0.1 ; // 10% discount

    private double totalCost;

    public DigitalProduct(int productId, String productName, double price, double fileSize){
        super(productId,productName,price);
        this.fileSize = fileSize;
    }
    
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("The File size (in Mbs) of " + super.getProductName() + " is: " + fileSize);
    
    }

    @Override
    public void calculatePrice(int quantity){
        totalCost = (super.getPrice() - (super.getPrice() * discount)) * quantity ;
        System.out.println("The Discount applied is : " + (super.getPrice() * discount * quantity));

        System.out.println("The total cost will be : " + totalCost);

    }
}
