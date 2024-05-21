package lesson4.chainOfResponsibility;

public interface Chain {
    void nextChain(Chain nextChain);
    void process(Request request);
}
