package xinfan.example.designpatern.reponsibility.chain.demo1;

public class HandlerB extends Handler{
    @Override
    public boolean doHandle() {
        System.out.println("我是HandlerB 我正在执行");
        return true;
    }
}
