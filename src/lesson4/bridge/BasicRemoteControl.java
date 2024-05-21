package lesson4.bridge;

public class BasicRemoteControl extends AbstractControl {
    public BasicRemoteControl(Remote remote) {
        super(remote);
    }

    @Override
    void power() {
        remote.power();
    }

    @Override
    void volumeUp() {
        remote.volumeUp();
    }

    @Override
    void volumeDown() {
        remote.volumeDown();
    }
}
