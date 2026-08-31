package OnlineShoppingSystem;

public class Main {
    public static void main(String[] args){


// Parent-class references pointing to child-class objects.
        Product Television = new PhysicalProduct(1, "Samsung TV", 90000, 2000);
        Television.displayInfo();
        Television.calculatePrice(3);

        Product eBook = new DigitalProduct(2, "Principles of work", 200, 50);
        eBook.displayInfo();
        eBook.calculatePrice(2);

        Product spotifyPremium = new SubscriptionProduct(3, "Spotify Music", 201, 12);
        spotifyPremium.displayInfo();
        spotifyPremium.calculatePrice(12);

    }
}
