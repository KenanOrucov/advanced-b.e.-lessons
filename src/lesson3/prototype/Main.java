package lesson3.prototype;

public class Main {

    public static void main(String[] args) {

        var robot = new RobotDeepCopy("Robot", "Tesla");
        System.out.println(robot);

        var copy = (RobotDeepCopy) robot.clone();
        copy.setName("RobotCopy");
        copy.setBrand("TeslaCopy");
        System.out.println(copy);

        System.out.println(robot.hashCode());
        System.out.println(copy.hashCode());

        System.out.println("-----------------------------------");

        var robot2 = new RobotShallowCopy("Robot", "Tesla");
        System.out.println(robot2);

        var copy2 = (RobotShallowCopy) robot2.clone();
        copy2.setName("RobotCopy");
        copy2.setBrand("TeslaCopy");

        System.out.println("Copy2: " + copy2);
        System.out.println("Copy1: " + robot2);
        System.out.println(robot2.hashCode());
        System.out.println(copy2.hashCode());
    }
}
