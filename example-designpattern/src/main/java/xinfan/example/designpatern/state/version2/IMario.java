package xinfan.example.designpatern.state.version2;

import xinfan.example.designpatern.state.version1.State;

public interface IMario {
    State getName();
    void obtainMushRoom();
    void obtainCape();
    void obtainFireFlower();
    void meetMonster();
}
