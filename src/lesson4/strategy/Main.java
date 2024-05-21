package lesson4.strategy;

public class Main {

    public static void main(String[] args) {

        Strategy strategy = new StrategyOne();
        var context = new Context(strategy);
        context.executeStrategy();

        strategy = new StrategyTwo();
        context.setStrategy(strategy);
        context.executeStrategy();
    }
}
