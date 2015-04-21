package ee.eovchar.drawprimitives;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
/**
 * Created by EdSevenNew on 19.04.2015.
 */
public class drawRectangle extends DrawCanvas
{
    public drawRectangle(Context context)
    {
        super(context);
    }
    @Override
    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        //Rectangle
        mPaint.setColor(Color.RED);
        // left top right bottom
        // left <= right and top <= bottom
        canvas.drawRect(100,100,350,350,mPaint);
    }
}
