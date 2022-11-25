package main.com.Structural_Pattern.Proxy;

public class RealInternetAccess implements OfficeInternetAccess{
    private String employeeName;

    public RealInternetAccess(String employeeName) {
        this.employeeName = employeeName;
    }

    public void grantInternetAccess() {
        System.out.println("Internet Access granted for employee: " + employeeName);
    }
}
