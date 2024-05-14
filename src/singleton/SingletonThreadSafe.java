package singleton;

public class SingletonThreadSafe {
    private static volatile SingletonThreadSafe obj = null;
    private SingletonThreadSafe() {}


    public static SingletonThreadSafe getInstance()
    {
        if (obj == null) {
            synchronized (SingletonThreadSafe.class)
            {
                if (obj == null)
                    obj = new SingletonThreadSafe();
            }
        }
        return obj;
    }
}
