package ee.eovchar.drawprimitives;

import android.app.Activity;
import android.os.Bundle;


public class ActivityLine extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        DrawLine drawLine = new DrawLine(this);
        setContentView(drawLine);
    }
}