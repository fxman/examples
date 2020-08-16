package xinfan.example.designpatern.reponsibility.chain.demo2;

import java.util.ArrayList;
import java.util.List;

public class HandlerChain {
    private List<IHandler> chain = new ArrayList<>();
    public void addHanler(IHandler hanler){
        chain.add(hanler);
    }
    public void handle(){
        for (IHandler iHandler : chain) {
            if(!iHandler.handle()){
                break;
            }
        }
    }
}
