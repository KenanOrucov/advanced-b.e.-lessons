package lesson3.factory;

public class UNECUniversity implements University {
    private Integer point = 500;

    @Override
    public String informationTechnologyPoint() {
        return "Information Technology Point: " + point + " in UNEC University";


    }
}
