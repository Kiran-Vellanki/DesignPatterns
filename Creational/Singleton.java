public class Singleton {
    static Singleton singleton;

    public Singleton() {

    }

    public static Singleton getInstance() {

        if (singleton == null) {
            synchronized (SingleRoom.class) {
                if (singleton == null)
                    singleton = new Singleton();
            }
        }
        return singleton;
    }

    public static void main(String[] args) {
        System.out.println(singleton);
        getInstance();
        System.out.println(singleton);
        System.gc();
    }

}
