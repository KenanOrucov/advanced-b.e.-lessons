package lesson4.bridge;

public class SonyTv implements Remote{
    @Override
    public void power() {
        System.out.println("SonyTv power");
    }

    @Override
    public void volumeUp() {
        System.out.println("SonyTv volumeUp");
    }

    @Override
    public void volumeDown() {
        System.out.println("SonyTv volumeDown");
    }
}
