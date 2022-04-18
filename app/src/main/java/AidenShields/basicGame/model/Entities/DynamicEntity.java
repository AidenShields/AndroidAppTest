package AidenShields.basicGame.model.Entities;

import AidenShields.basicGame.model.Util.Vector2D;

public abstract class DynamicEntity implements Entity {
    public abstract boolean collidesWith(Entity entity); // returns true if collides with provided entitiy

    public abstract void collidWith(Entity entity); // entity specific behaviour on collision

    public abstract void setPosition(Vector2D pos);

    public abstract Vector2D getPositionBeforeLastUpdate();

    public abstract Vector2D getVelocity();

    public abstract void setVelocity(Vector2D vel);

    public abstract void update(double durationMilli, double levelGravity);
}
