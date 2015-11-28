package m_eldeeb.ahlawy;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import m_eldeeb.ahlawy.imageplayer.ImagesOfPlayer;


public class MainActivity extends ActionBarActivity {
ImageView img;
    LinearLayout li;
    TextView t;
    Button b1;
    Button b2;
    Button b3;
    Button b4;
    Button b5;
    Button b6;
    Button b7;
    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        li=(LinearLayout)findViewById(R.id.buttons);
        img=(ImageView)findViewById(R.id.imageView2);
        b2=(Button)findViewById(R.id.button2);
        img.setVisibility(View.INVISIBLE);
        b1=(Button)findViewById(R.id.button);
        b2=(Button)findViewById(R.id.button2);
        b3=(Button)findViewById(R.id.button3);
        b4=(Button)findViewById(R.id.button4);
        b5=(Button)findViewById(R.id.button5);
        b6=(Button)findViewById(R.id.button6);
        b7=(Button)findViewById(R.id.button7);

          Animation myAnim1;
        View v=new View(this);

        for (int i=1;i<8;i++){
            if(i%2!=0){
             myAnim1 = AnimationUtils.loadAnimation(this, R.anim.translate);}
            else {myAnim1 = AnimationUtils.loadAnimation(this, R.anim.translate2);}
            int x=i*2000+7000;
            myAnim1.setStartOffset(x);
            switch (i){
                case 1: b1.setAnimation(myAnim1);break;
                case 2: b2.setAnimation(myAnim1);break;
                case 3: b3.setAnimation(myAnim1);break;
                case 4: b4.setAnimation(myAnim1);break;
                case 5: b5.setAnimation(myAnim1);break;
                case 6: b6.setAnimation(myAnim1);break;
                case 7: b7.setAnimation(myAnim1);break;

            }




        }

        myAnim1 = AnimationUtils.loadAnimation(this, R.anim.alpha);
        myAnim1.setStartOffset(1000);
        img.setAnimation(myAnim1);

        v.startAnimation(myAnim1);


        li.setVisibility(View.VISIBLE);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MainActivity.this, ImagesOfPlayer.class);
                startActivity(i);
            }
        });
        }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
