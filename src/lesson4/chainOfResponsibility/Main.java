package lesson4.chainOfResponsibility;

public class Main {

    public static void main(String[] args) {

        var chainOne = new ChainOne();
        var chainOne2 = new ChainOne();
        var chainTwo = new ChainTwo();
        chainOne.nextChain(chainTwo);
//
        chainOne.process(new Request("request1"));
        chainOne2.process(new Request("request2"));
    }
}
