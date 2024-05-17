package lesson3.factory;

public class BANMUniversity implements University {
    private Integer point = 670;

    @Override
    public String informationTechnologyPoint() {
        return "Information Technology Point: " + point + " in BANM University";
    }
}
