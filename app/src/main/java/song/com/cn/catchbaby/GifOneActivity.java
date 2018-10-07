package song.com.cn.catchbaby;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import pl.droidsonroids.gif.GifImageView;


public class GifOneActivity extends AppCompatActivity {

    private GifImageView gifimage_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gif_one);
        gifimage_view = findViewById(R.id.gifimage_view);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Log.d("---------", "--------------run: ");
                gifimage_view.setVisibility(View.GONE);
            }
        }, 800);
        findViewById(R.id.okfinish).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(GifOneActivity.this, OverActivity.class);
                startActivity(intent);
            }
        });
    }

}
