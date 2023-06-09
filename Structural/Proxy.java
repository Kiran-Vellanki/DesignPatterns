import javax.print.DocFlavor.STRING;

interface InternetAccess {
    public void grantInternetAccess();
}

class RealInternetAccess implements InternetAccess {

    String name;

    RealInternetAccess(String name) {
        this.name = name;
    }

    @Override
    public void grantInternetAccess() {
        System.out.println("access granted: " + name);
    }

}

class ProxyInternetAccess implements InternetAccess {
    RealInternetAccess realInternetAccess;
    String name;

    public ProxyInternetAccess(String name) {
        this.name = name;
    }

    @Override
    public void grantInternetAccess() {
        if (getId() > 5) {
            realInternetAccess = new RealInternetAccess(name);
            realInternetAccess.grantInternetAccess();
        } else
            System.out.println("no internet access: " + name);

    }

    int getId() {
        return 5;
    }

}

/**
 * Proxy
 */
public class Proxy {
    public static void main(String[] args) {

        InternetAccess internetAccess = new ProxyInternetAccess("Kiran Vellanki");
        internetAccess.grantInternetAccess();

    }

}