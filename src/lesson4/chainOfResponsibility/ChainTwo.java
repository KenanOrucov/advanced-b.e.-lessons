package lesson4.chainOfResponsibility;

public class ChainTwo implements Chain {

    private Chain nextChain;


    @Override
    public void nextChain(Chain nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public void process(Request request) {
        System.out.println("ChainTwo");
        if (nextChain != null) {
            nextChain.process(request);
        }else {
            System.out.println("No next chain  in chainTwo");
        }
    }

}
