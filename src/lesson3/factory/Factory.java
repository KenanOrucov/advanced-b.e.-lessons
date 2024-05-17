package lesson3.factory;

public class Factory {

    public static String getUniversity(String university) {
        if (university.equals("ASOIU")) {
            return new ASOIUUniversity().informationTechnologyPoint();
        } else if (university.equals("UNEC")) {
            return new UNECUniversity().informationTechnologyPoint();
        } else if (university.equals("BANM")) {
            return new BANMUniversity().informationTechnologyPoint();
        }
        return null;
    }
}
