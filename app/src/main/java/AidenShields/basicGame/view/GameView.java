package AidenShields.basicGame.view;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

import androidx.annotation.NonNull;

import AidenShields.basicGame.R;
import AidenShields.basicGame.MainThread;
import AidenShields.basicGame.model.Entities.StaticEntity;
import AidenShields.basicGame.model.Entities.StaticEntityImpl;

public class GameView extends SurfaceView implements SurfaceHolder.Callback {
    MainThread thread;
    private StaticEntity redSquare = new StaticEntityImpl(BitmapFactory.decodeResource(getResources(), R.drawable.infinty), 375, 219, 100,100);


    public GameView(Context context){
        super(context);
        getHolder().addCallback(this);
        thread = new MainThread(getHolder(), this);
        setFocusable(true);
    }

    @Override
    public void surfaceCreated(@NonNull SurfaceHolder surfaceHolder) {
        thread.setRunning(true);
        thread.start();
    }

    @Override
    public void surfaceChanged(@NonNull SurfaceHolder surfaceHolder, int i, int i1, int i2) {

    }

    @Override
    public void surfaceDestroyed(@NonNull SurfaceHolder surfaceHolder) {
        boolean retry = false;
        while(retry){
            try {
                thread.setRunning(false);
                thread.join();
            } catch (InterruptedException e){
                e.printStackTrace();
            }
            retry = false;
        }
    }
    public void update(){
    }
    @Override
    public void draw(Canvas canvas) {
        super.draw(canvas);

        if (canvas != null) {
            canvas.drawColor(Color.WHITE);
        }
    }
}
