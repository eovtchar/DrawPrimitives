package ee.eovchar.drawprimitives;

import android.app.Activity;
import android.os.Bundle;

public class activityRectangle extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        drawRectangle drawRect = new drawRectangle(this);
        setContentView(drawRect);
    }
}
