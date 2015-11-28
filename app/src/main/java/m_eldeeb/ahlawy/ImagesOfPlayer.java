package m_eldeeb.ahlawy;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import m_eldeeb.ahlawy.R;

/**
 * Created by mahmoud on 20/11/2015.
 */
public class ImagesOfPlayer extends Activity{
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.photo_player);

        GridView gridview = (GridView) findViewById(R.id.gridview);
        gridview.setAdapter(new ImageAdapter(this));

       gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {
                Toast.makeText(ImagesOfPlayer.this, "" + position,
                        Toast.LENGTH_SHORT).show();
            }
        });
    }

}
