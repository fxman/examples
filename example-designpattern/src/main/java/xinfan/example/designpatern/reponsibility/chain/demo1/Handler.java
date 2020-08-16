package xinfan.example.designpatern.reponsibility.chain.demo1;

public abstract class Handler {
    protected Handler successor = null;
    public void setSuccessor(Handler successor){
        this.successor = successor;
    }
    public void handle(){
       boolean handle = this.doHandle();
       if(handle && successor != null){
           successor.handle();
       }
    }
    protected abstract boolean doHandle();
}
