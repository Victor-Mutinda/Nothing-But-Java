package OnlineShoppingSystem;

public class Product {
    private int productId;
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

    public void setProductId(int productId){
        this.productId = productId;
    }

    public void setProductName(String productName){
        this.productName = productName;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public void displayInfo(){
        System.out.println("----Product Information----");
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
    }

    public void calculatePrice(int quantity){
   
        System.out.println("The total cost will be : " + (price * quantity));
       
    }

    
}
