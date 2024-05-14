package singleton;

import static singleton.SingletonEnum.object;

public class Main {

    public static void main(String[] args) {
        SingletonThreadSafe obj1 = SingletonThreadSafe.getInstance();
        SingletonThreadSafe obj2 = SingletonThreadSafe.getInstance();
        SingletonThreadSafe obj3 = SingletonThreadSafe.getInstance();

        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);

        System.out.println("------------");

        SingletonEnum obj4 = object;
        SingletonEnum obj5 = object;
        SingletonEnum obj6 = object;

        System.out.println(obj4);
        System.out.println(obj5);
        System.out.println(obj6);

    }
}
