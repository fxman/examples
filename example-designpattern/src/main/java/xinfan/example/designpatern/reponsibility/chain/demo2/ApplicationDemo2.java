package xinfan.example.designpatern.reponsibility.chain.demo2;

public class ApplicationDemo2 {
    public static void main(String[] args) {
        HandlerChain chain = new HandlerChain();
        chain.addHanler(new HandlerB());
        chain.addHanler(new HandlerA());
        chain.handle();
    }
}
