package xinfan.example.designpatern.reponsibility.chain.demo1;

public class ApplicationDemo {
    public static void main(String[] args) {
        HandlerChain chain = new HandlerChain();
        chain.addHandler(new HandlerA());
        chain.addHandler(new HandlerB());
        chain.handle();
    }
}
