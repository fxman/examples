package xinfan.example.designpatern.state.version2;

import xinfan.example.designpatern.state.version1.MarioStateMacine;
import xinfan.example.designpatern.state.version1.State;

public class SmallMario implements IMario {
    private MarioStateMacine stateMacine;
    public SmallMario(MarioStateMacine stateMacine){
        this.stateMacine = stateMacine;
    }
    @Override
    public State getName() {
        return State.SMALL;
    }

    @Override
    public void obtainMushRoom() {
        stateMacine.setCurrentState(new SuperMario(stateMacine));
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
