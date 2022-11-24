package main.com.Structural_Pattern.Facade;

public class ShopKeeper {
    private static ShopKeeper instance;
    private MobileShop iphone;
    private MobileShop samsung;
    private MobileShop xiaomi;

    private ShopKeeper() {
        iphone = new Iphone();
        samsung = new Samsung();
        xiaomi = new Xiaomi();
    }

    public static ShopKeeper getInstance() {
        if (instance != null) {
            return instance;
        } else {
            return new ShopKeeper();
        }
    }

    public void iphoneSale() {
        iphone.modelName();
        iphone.price();
    }

    public void samsungSale() {
        samsung.modelName();
        samsung.price();
    }

    public void xiaomiSale() {
        xiaomi.modelName();
        xiaomi.price();
    }
}
