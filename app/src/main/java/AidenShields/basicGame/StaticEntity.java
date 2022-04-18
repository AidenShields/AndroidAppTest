package AidenShields.basicGame;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.widget.ImageView;

public class StaticEntity {
    private int screenWidth = Resources.getSystem().getDisplayMetrics().widthPixels;
    private int screenHeight = Resources.getSystem().getDisplayMetrics().heightPixels;
    private int xVelocity = 10
            , yVelocity = 5;
    private Bitmap bitmap;
    int x,y;

    public StaticEntity(Bitmap bmp, int x, int y){
        bitmap = bmp;
        this.x = x;
        this.y = y;
    }
    public void draw(Canvas canvas){
        canvas.drawBitmap(Bitmap.createScaledBitmap(bitmap, 375,219,false), x, y, null);
    }
    public void update(){
        x += xVelocity;
        y += yVelocity;

        if(x > screenWidth - 375 || x < 0){
            xVelocity *= -1;
        }
        if(y > screenHeight - 219 || y < 0){
            yVelocity *= -1;
        }
    }

}
