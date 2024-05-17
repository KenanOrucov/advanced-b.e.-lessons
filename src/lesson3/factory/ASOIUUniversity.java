package lesson3.factory;

public class ASOIUUniversity implements University {
    private Integer point = 640;


    @Override
    public String informationTechnologyPoint() {
        return "Information Technology Point: " + point + " in ASOIU University";
    }
}
