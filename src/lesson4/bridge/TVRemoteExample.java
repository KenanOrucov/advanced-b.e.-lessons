package lesson4.bridge;

public class TVRemoteExample {

    public static void main(String[] args) {
        var remote = new SonyTv();
        var abstractControl = new BasicRemoteControl(remote);

        abstractControl.power();
        abstractControl.volumeUp();
        abstractControl.volumeDown();

        var remote2 = new SamsungTv();
        var abstractControl2 = new BasicRemoteControl(remote2);

        abstractControl2.power();
        abstractControl2.volumeUp();
        abstractControl2.volumeDown();
    }
}
