package lesson2.singleton;

public class Main {

    public static void main(String[] args) {
        SingletonThreadSafe obj1 = SingletonThreadSafe.getInstance();
        SingletonThreadSafe obj2 = SingletonThreadSafe.getInstance();
        SingletonThreadSafe obj3 = SingletonThreadSafe.getInstance();

        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);

        System.out.println("------------");

        SingletonEnum obj4 = SingletonEnum.object;
        SingletonEnum obj5 = SingletonEnum.object;
        SingletonEnum obj6 = SingletonEnum.object;

        System.out.println(obj4);
        System.out.println(obj5);
        System.out.println(obj6);

    }
}
