package main.com.Structural_Pattern.Proxy;

public class ProxyInternetAccess implements OfficeInternetAccess{
    private String employeeName;
    private boolean isAllow;
    private RealInternetAccess realAccess;

    public ProxyInternetAccess(){}

    public ProxyInternetAccess(String employeeName, boolean isAllow) {
        this.employeeName = employeeName;
        this.isAllow = isAllow;
    }
    
    public int getRole(String employeeName) {
        if (isAllow) {
            return 5;
        } else {
            return 1;            
        }
    }

    public void grantInternetAccess() {
        if (getRole(employeeName) > 4) {
            realAccess = new RealInternetAccess(employeeName);
            realAccess.grantInternetAccess();
        } else {
            System.out.println("No Internet access granted. Your job level is below 5");
        }
    }
}
