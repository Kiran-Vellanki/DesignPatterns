interface Item {
    String name();

    String size();

    float price();
}

abstract class Pizza implements Item {
    @Override
    public abstract float price();

}

abstract class ColdDrink implements Item {
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

public class Builder {

}
