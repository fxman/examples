package xinfan.example.designpatern.state.version1;

/**
 * 状态机
 */
public class MarioStateMacine {
    private int score;
    private State currentState;
    public MarioStateMacine(){
        this.score = 0;
        this.currentState = State.SMALL;
    }

    /**
     * 获得蘑菇
     */
    public void obtainMushRoom(){
        if(currentState.equals(State.SMALL)){
            this.currentState = State.SUPER;
            this.score += 100;
        }
    }

    /**
     * 获得斗篷
     */
    public void  obtainCape(){
        if(currentState.equals(State.SMALL) || currentState.equals(State.SUPER)){
            this.currentState = State.CAPE;
            this.score += 200;
        }
    }

    /**
     * 获得火焰
     */
    public void ontainFireFlower(){
        if(currentState.equals(State.SMALL) || currentState.equals(State.SUPER)){
            this.currentState = State.FIRE;
            this.score += 300;
        }
    }

    /**
     * 遇到怪兽
     */
    public void meetMonster(){
        if(currentState.equals(State.SUPER)){
            this.currentState = State.SMALL;
            this.score -= 100;
            return;
        }
        if(currentState.equals(State.CAPE)){
            this.currentState = State.SMALL;
            this.score -= 200;
            return;
        }
        if(currentState.equals(State.FIRE)){
            this.currentState = State.SMALL;
            this.score -= 300;
            return;
        }
    }

    /**
     * 获取分数
     * @return
     */
    public int getScore(){
        return this.score;
    }

    /**
     * 获取当前状态
     * @return
     */
    public State getCurrentState(){
        return this.currentState;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }
}
