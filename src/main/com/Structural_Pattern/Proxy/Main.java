package main.com.Structural_Pattern.Proxy;

public class Main {
    public static void main(String[] args) {
        OfficeInternetAccess proxy = new ProxyInternetAccess("Hong Hung",true);
        proxy.grantInternetAccess();
        proxy = new ProxyInternetAccess("Huy Hoang",false);
        proxy.grantInternetAccess();
        
    }
}
