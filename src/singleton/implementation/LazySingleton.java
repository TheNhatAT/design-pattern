package singleton.implementation;

//Lazy
public class LazySingleton {
    private static LazySingleton uniqueInstance;

    private LazySingleton() { }

    // synchronized force every thread to wait its turn before it can enter
    // the method
    // But synchronized is expensive
    public static synchronized LazySingleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new LazySingleton();
        }

        return uniqueInstance;
    }
}
