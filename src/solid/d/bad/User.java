package solid.d.bad;

public class User {

    private String name;
    private String job;
    private MasterCard masterCard;

    public User(String name, String job, MasterCard masterCard) {
        this.name = name;
        this.job = job;
        this.masterCard = masterCard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public MasterCard getMasterCard() {
        return masterCard;
    }

    public void setMasterCard(MasterCard masterCard) {
        this.masterCard = masterCard;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", masterCard=" + masterCard +
                '}';
    }
}
