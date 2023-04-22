import java.util.ArrayList;

interface Items {
    String name();

    String size();

    float price();
}

abstract class Pizza implements Items {
    @Override
    public abstract float price();

}

abstract class ColdDrink implements Items {
    @Override
    public abstract float price();
}

abstract class VegPizza extends Pizza {
    @Override
    public abstract String name();

    @Override
    public abstract float price();

    @Override
    public abstract String size();

}

abstract class NonVegPizza extends Pizza {
    @Override
    public abstract String name();

    @Override
    public abstract String size();

    @Override
    public abstract float price();

}

class SmallPizza extends VegPizza {
    String name;
    String size;
    float price;

    public SmallPizza(String name, String size, float price) {
        this.name = name;
        this.size = size;
        this.price = price;
    }

    @Override
    public String name() {
        return this.name;
    }

    @Override
    public String size() {
        return this.size;
    }

    @Override
    public float price() {
        return this.price;
    }
}

abstract class Coke extends ColdDrink {
    @Override
    public abstract float price();

}

abstract class Pepsi extends ColdDrink {
    @Override
    public abstract float price();
}

class SmallCoke extends Coke {
    public SmallCoke() {
    }

    String name;
    String size;
    float price;

    public SmallCoke(String name, String size, float price) {
        this.name = name;
        this.size = size;
        this.price = price;
    }

    @Override
    public String name() {
        return "coke";
    }

    @Override
    public String size() {
        return "small coke";
    }

    @Override
    public float price() {
        return 40;
    }
}

class MediumPizza extends Pizza {
    public MediumPizza() {
    }

    String name;
    String size;
    float price;

    public MediumPizza(String name, String size, float price) {
        this.name = name;
        this.size = size;
        this.price = price;
    }

    @Override
    public String name() {
        return "Medium pizza";
    }

    @Override
    public String size() {
        return "Medium";
    }

    @Override
    public float price() {
        return 60f;
    }

}

class OrderItems {
    ArrayList<Items> item = new ArrayList<>();

    public void addItem(Items i) {
        item.add(i);
    }

    public float getCost() {
        float cost = 0;
        for (Items item2 : item) {
            cost += item2.price();
        }
        return cost;
    }

    public void getName() {
        for (Items item2 : item) {
            System.out.println(item2.name());
        }
    }
}

public class Builder {
    public static void main(String[] args) {
        OrderItems items = new OrderItems();
        Items item = new MediumPizza();
        Items item2 = new SmallCoke();
        items.addItem(item);
        items.addItem(item2);
        System.out.println(items.getCost());
    }
}
