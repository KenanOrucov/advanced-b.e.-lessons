package lesson4.bridge;

public class SamsungTv implements Remote{
    @Override
    public void power() {
        System.out.println("SamsungTv power");
    }

    @Override
    public void volumeUp() {
        System.out.println("SamsungTv volumeUp");
    }

    @Override
    public void volumeDown() {
        System.out.println("SamsungTv volumeDown");
    }
}
