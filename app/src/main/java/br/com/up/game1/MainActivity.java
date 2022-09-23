package br.com.up.game1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    Date currentTime = Calendar.getInstance().getTime();

    ImageView frogSprite;
    TextView text;

    boolean game = true;
    long time;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        frogSprite = findViewById(R.id.frog);
        text = findViewById(R.id.debugText);

        while (game)
        {
            time = System.currentTimeMillis();
            text.setText(Long.toString(time));
//            Thread.sleep(100);
        }
    }
}