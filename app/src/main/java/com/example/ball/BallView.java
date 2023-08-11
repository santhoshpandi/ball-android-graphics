package com.example.ball;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class BallView extends View {
    private float ballX = 100; // Initial X position of the ball
    private float ballY = 100; // Initial Y position of the ball
    private static final int BALL_RADIUS = 30;
    private Paint paint;

    public BallView(Context context, AttributeSet attrs) {
        super(context, attrs);
        paint = new Paint();
        paint.setColor(Color.BLUE);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawColor(Color.WHITE);
        canvas.drawCircle(ballX, ballY, BALL_RADIUS, paint);
    }

    // Method to update the ball's position
    public void updatePosition(float deltaX, float deltaY) {
        ballX += deltaX;
        ballY += deltaY;
        invalidate(); // Trigger onDraw to redraw the ball at the new position
    }
}
