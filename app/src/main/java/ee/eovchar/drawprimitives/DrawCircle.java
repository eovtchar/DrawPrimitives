package ee.eovchar.drawprimitives;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;

/**
 * Created by EdSevenNew on 20.04.2015.
 */
public class DrawCircle extends DrawCanvas
{
    public DrawCircle(Context context)

    {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        //Circle
        mPaint.setColor(Color.RED);
        canvas.drawCircle(150,150,50,mPaint);
    }
}