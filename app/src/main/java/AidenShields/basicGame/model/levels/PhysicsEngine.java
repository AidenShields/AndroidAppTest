package AidenShields.basicGame.model.levels;

import AidenShields.basicGame.model.Entities.DynamicEntity;
import AidenShields.basicGame.model.Entities.StaticEntity;

public interface PhysicsEngine {
    void resolveCollision(DynamicEntity a, StaticEntity b, Level level);

    void resolveCollision(DynamicEntity a, DynamicEntity b);

    void enforceWorldLimits(DynamicEntity a, Level level);
}