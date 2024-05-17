package lesson3.prototype;

public class RobotShallowCopy implements Cloneable {
    private String name;
    private String brand;

    public RobotShallowCopy(String name, String brand) {
        this.name = name;
        this.brand = brand;
    }

    public RobotShallowCopy() {
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
    protected RobotShallowCopy clone() {
        return this;
    }

    @Override
    public String toString() {
        return "RobotDeepCopy{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }
}
