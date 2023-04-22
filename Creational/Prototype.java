interface Pen {
    public Pen clone();
}

class PenPrototype implements Pen {
    String name;
    String color;
    double cost;

    public PenPrototype(String name, String color, double cost) {
        this.name = name;
        this.color = color;
        this.color = color;
    }

    @Override
    public Pen clone() {
        return new PenPrototype(name, color, cost);
    }

    @Override
    public String toString() {
        return "PenPrototype [name=" + name + ", color=" + color + ", cost=" + cost + "]";
    };
}

/**
 * Prototype
 */
public class Prototype {
    public static void main(String[] args) {
        Pen pen = new PenPrototype("cello", "blue", 10);
        System.out.println(pen.toString());
        Pen pen2 = pen.clone();
        System.out.println(pen2.clone());

    }
}