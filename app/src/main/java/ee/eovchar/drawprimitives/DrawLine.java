package ee.eovchar.drawprimitives;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;

/**
 * Created by EdSevenNew on 20.04.2015.
 */
public class DrawLine extends DrawCanvas
{
    public DrawLine(Context context)

    {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        //Circle
        mPaint.setColor(Color.YELLOW);
        canvas.drawPaint(mPaint);
        mPaint.setColor(Color.BLACK);
        canvas.drawLine(0,0,200,200,mPaint);
    }
}
