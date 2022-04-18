package AidenShields.basicGame.model;

import AidenShields.basicGame.model.levels.Level;

public interface GameEngine {
    Level getCurrentLevel();
    void startLevel();
    boolean isGameFinished();
    boolean boostHeight();
    boolean dropHeight();
    void tick();

}
