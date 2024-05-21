package lesson4.facade;

public class ApplicationB implements Application {
    @Override
    public void run() {
        System.out.println("Running application B");
        shutdown();
    }

    public void shutdown() {
        System.out.println("Shutting down application B");
    }
}
