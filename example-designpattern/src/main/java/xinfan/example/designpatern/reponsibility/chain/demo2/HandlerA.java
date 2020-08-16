package xinfan.example.designpatern.reponsibility.chain.demo2;

public class HandlerA implements IHandler {
    @Override
    public boolean handle() {
        boolean handle = false;
        System.out.println("我是HanlerA 我正在执行");
        return !handle;
    }
}
