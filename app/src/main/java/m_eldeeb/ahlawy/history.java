package m_eldeeb.ahlawy;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by mahmoud on 28/10/2015.
 */
public class history extends Activity {
    TextView t;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.history);
        t=(TextView)findViewById(R.id.textView);

       t.setTextColor(Color.parseColor("#FFFFFF"));

    }

    }
