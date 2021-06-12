package com.example.iseenero;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class Loading_Screen extends AppCompatActivity {

    Animation topAnim,bottomAnim,titleAnim;
    ImageView logo,background;
    TextView title;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading__screen);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        logo = findViewById(R.id.Logo);
        background = findViewById(R.id.Background);
        title = findViewById(R.id.Title);

//        Animation
        topAnim = AnimationUtils.loadAnimation(this,R.anim.top_animation);
        bottomAnim = AnimationUtils.loadAnimation(this,R.anim.bottom_animation);
        titleAnim = AnimationUtils.loadAnimation(this,R.anim.title_animation);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {

            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
                finish();
            }
        }, 2000L); //3000 L = 3 detik

        logo.setAnimation(topAnim);
        background.setAnimation(bottomAnim);
        title.setAnimation(titleAnim);


    }
}