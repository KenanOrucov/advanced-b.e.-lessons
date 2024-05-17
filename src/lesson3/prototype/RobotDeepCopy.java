package lesson3.prototype;

public class RobotDeepCopy implements Cloneable {
    private String name;
    private String brand;

    public RobotDeepCopy(String name, String brand) {
        this.name = name;
        this.brand = brand;
    }

    public RobotDeepCopy() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    protected RobotDeepCopy clone() {
        return new RobotDeepCopy(this.name, this.brand);
    }

    @Override
    public String toString() {
        return "RobotDeepCopy{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }
}
