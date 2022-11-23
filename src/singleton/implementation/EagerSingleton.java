package singleton.implementation;

public class EagerSingleton {

    // thread safe
    // JVM create the unique instance when the class is loaded
    // because uniqueInstance is static
    private static final EagerSingleton uniqueInstance = new EagerSingleton();

    private EagerSingleton() {}

    public static EagerSingleton getInstance() {
        return uniqueInstance;
    }
}
