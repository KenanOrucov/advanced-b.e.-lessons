package lesson4.bridge;

public abstract class AbstractControl {
    protected Remote remote;

    public AbstractControl(Remote remote) {
        this.remote = remote;
    }

    abstract void power();
    abstract void volumeUp();
    abstract void volumeDown();
}
