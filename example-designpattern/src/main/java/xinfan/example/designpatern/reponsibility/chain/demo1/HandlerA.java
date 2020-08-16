package xinfan.example.designpatern.reponsibility.chain.demo1;

public class HandlerA extends Handler{
    @Override
    public boolean doHandle() {
        System.out.println("我是HandlerA   我正在执行");
        return false;
    }
}
