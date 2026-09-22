package OnlineShoppingSystem;

public class Product {
    private final int productId; // This makes the Id to be unchangeable.
    private String productName;
    private double price;
    
    
    public Product(int productId, String productName, double price){
        this.productId =  productId ;
        this.productName = productName;
        this.price = price;
    }

    public int getProductId(){
        return productId;        
    }

    public String getProductName(){
        return productName;
    }

    public double getPrice(){
        return price;
    }
// No need to have a setter for productId cause we have defined it as final. Can't be changed
    //public void setProductId(int productId){
    //    this.productId = productId;
    //}

    public void setProductName(String productName){
        this.productName = productName;
    }
// Including this will make the price to be changed from the Main file. Goood Encapsulation thinking
    //public void setPrice(double price){
    //    this.price = price;
    //}

    protected void updatePrice(double newPrice){
        this.price =  newPrice ;
    }

    public void displayInfo(){
        System.out.println("----Product Information----");
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
    }

    public void calculatePrice(int quantity){
   
        System.out.println("The total cost will be : " + (price * quantity));

    }

    protected double appyDiscount(double promo){

        double promotionDiscount = promo * price;

        return promotionDiscount;

    }
    
}
