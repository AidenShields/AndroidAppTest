package AidenShields.basicGame.model.levels;

import java.util.List;

import AidenShields.basicGame.model.Entities.Entity;

public interface Level {

    List<Entity> getEntities();

    double getLevelHeight();

    double getLevelWidth();

    double getHeroWidth();

    double getHeroHight();

    double getFloorHeight();

    double getFloorColor();

    double getGravity();

    void update();

    double getHeroX();

    double getHeroY();

    boolean boostHeight();

    boolean dropHeight();

    boolean isHero(Entity entity);

    void resetHero();

    void finish();

    boolean isFinished();


}
