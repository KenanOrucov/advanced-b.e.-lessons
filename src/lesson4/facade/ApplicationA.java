package lesson4.facade;

public class ApplicationA implements Application {
    @Override
    public void run() {
        System.out.println("Running application A");
        socialMedia();
    }

    public void socialMedia() {
        System.out.println("Running social media A");
    }
}
