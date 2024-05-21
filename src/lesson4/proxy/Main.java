package lesson4.proxy;

public class Main {
    public static void main(String[] args) {
        var app = new KapitalBankProxy();
        System.out.println(app.openApp());
    }
}
