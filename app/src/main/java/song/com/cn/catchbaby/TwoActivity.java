package song.com.cn.catchbaby;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.MediaController;

import pl.droidsonroids.gif.GifDrawable;
import pl.droidsonroids.gif.GifImageView;

public class TwoActivity extends AppCompatActivity {

    private GifImageView getDrawable;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        //上的3行代码也可以通过下面代码实现，是同理的,通过布局来获得空间
        getDrawable=findViewById(R.id.getDrawable);
        //获取控制器
        final MediaController mc = new MediaController(this);
        //将图片放入媒体控制器中
        mc.setMediaPlayer((GifDrawable) getDrawable.getDrawable());
        mc.setAnchorView(getDrawable);
        

        findViewById(R.id.okfinish).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TwoActivity.this, OverActivity.class);
                startActivity(intent);
            }
        });
    }
}
