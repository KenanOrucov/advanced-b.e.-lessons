package solid.l.bad;

public class ElectricCar extends Car {

    //Electric car does not have engine
    @Override
    public void startEngine() {
        System.out.println("Electric engine started...");
    }

    public void chargeBattery() {
        System.out.println("Battery charging...");
    }
}
