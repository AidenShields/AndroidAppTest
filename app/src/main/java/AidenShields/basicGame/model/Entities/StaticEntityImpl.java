package AidenShields.basicGame.model.Entities;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.media.Image;

import AidenShields.basicGame.model.Entities.StaticEntity;
import AidenShields.basicGame.model.Util.Vector2D;

public class StaticEntityImpl implements StaticEntity {
    private int screenWidth = Resources.getSystem().getDisplayMetrics().widthPixels;
    private int screenHeight = Resources.getSystem().getDisplayMetrics().heightPixels;
    private int xVelocity = 10
            , yVelocity = 5;
    private Bitmap bitmap;
    private int x,y, width, height;

    public StaticEntityImpl(Bitmap bmp, int width, int height, int x, int y){
        bitmap = bmp;
        this.x = x;
        this.y = y;
        this.height = height;
        this.width = width;
    }

    @Override
    public Image getImage() {
        return null;
    }

    @Override
    public Vector2D getPosition() {
        return null;
    }

    @Override
    public double getHeight() {
        return 0;
    }

    @Override
    public double getWidth() {
        return 0;
    }

    @Override
    public Layer getLayer() {
        return null;
    }
}





//    public void draw(Canvas canvas){
//        canvas.drawBitmap(Bitmap.createScaledBitmap(bitmap, width,height,false), x, y, null);
//    }
//    public void update(){
//        x += xVelocity;
//        y += yVelocity;
//
//        if(x > screenWidth - 375 || x < 0){
//            xVelocity *= -1;
//        }
//        if(y > screenHeight - 219 || y < 0){
//            yVelocity *= -1;
//        }
//    }
