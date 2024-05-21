package lesson4.chainOfResponsibility;

public class ChainOne implements Chain {

    private Chain nextChain;


    @Override
    public void nextChain(Chain nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public void process(Request request) {
        System.out.println("ChainOne");
        if (nextChain != null) {
            nextChain.process(request);
        }else {
            System.out.println("No next chain in chainOne");
        }
    }

}
