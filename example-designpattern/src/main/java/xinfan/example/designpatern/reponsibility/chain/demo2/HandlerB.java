package xinfan.example.designpatern.reponsibility.chain.demo2;

public class HandlerB implements IHandler {
    @Override
    public boolean handle() {
        System.out.println("我是HandleB 我正在执行");
        return false;
    }
}
