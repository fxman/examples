package xinfan.example.designpatern.state.version2;

import xinfan.example.designpatern.state.version1.MarioStateMacine;
import xinfan.example.designpatern.state.version1.State;

public class SuperMario implements IMario {
    private MarioStateMacine stateMacine;
    public SuperMario(MarioStateMacine stateMacine){
        this.stateMacine = stateMacine;
    }

    @Override
    public State getName() {
        return null;
    }

    @Override
    public void obtainMushRoom() {

    }

    @Override
    public void obtainCape() {

    }

    @Override
    public void obtainFireFlower() {

    }

    @Override
    public void meetMonster() {

    }
}
