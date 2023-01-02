package singleton.implementation;

public class DoubleCheckLockSingleton {
    private volatile static DoubleCheckLockSingleton uniqueInstance;

    private DoubleCheckLockSingleton() {}

    // Only synchronized the first time through
    // volatile: ensure that multiple threads handle the uniqueInstance variable correctly
    // when it is being init to the Singleton instance
    public static DoubleCheckLockSingleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (DoubleCheckLockSingleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new DoubleCheckLockSingleton();
                }
            }
        }

        return uniqueInstance;
    }
}
