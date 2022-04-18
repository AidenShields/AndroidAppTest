package AidenShields.basicGame.model.Entities;

import android.media.Image;

import AidenShields.basicGame.model.Util.Vector2D;

public interface Entity {

    Image getImage();

    Vector2D getPosition();

    double getHeight();

    double getWidth();

    Layer getLayer();

    enum Layer{
        BACKGROUND, FOREGROUND, EFFECT
    }


}
