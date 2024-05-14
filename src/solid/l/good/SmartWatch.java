package solid.l.good;

public class SmartWatch extends Watch {

    @Override
    public void start() {
        System.out.println("Show clock...");
    }

    public void price() {
        System.out.println("$200");
    }

    public void recordHealth() {
        System.out.println("Record health...");
    }
}
