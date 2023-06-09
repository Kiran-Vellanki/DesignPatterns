import java.lang.Character.UnicodeBlock;

interface Mobile {
    String getName();

    int getId();

    String getModel();
}

class Iphone implements Mobile {
    String name;
    int id;
    String model;

    public Iphone(int id, String name, String model) {
        this.id = id;
        this.model = model;
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getModel() {
        return model;
    }

}

class Samsung implements Mobile {
    String name;
    int id;
    String model;

    public Samsung(int id, String name, String model) {
        this.id = id;
        this.name = name;
        this.model = model;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public String getModel() {
        return this.model;
    }

}

class ShopKeeper {
    private Mobile samsung;
    private Mobile iphone;

    void iphoneDetails() {

    }

    void samsungDetails() {
        System.out.println("price " + 12000);
    }
}

/**
 * Facade
 */
public class Facade {

    public static void main(String[] args) {
        ShopKeeper shopKeeper = new ShopKeeper();
        shopKeeper.samsungDetails();

    }
}