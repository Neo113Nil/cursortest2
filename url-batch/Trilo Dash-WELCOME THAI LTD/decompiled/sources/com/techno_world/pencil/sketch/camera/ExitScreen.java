package com.techno_world.pencil.sketch.camera;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

/* loaded from: classes2.dex */
public class ExitScreen extends AppCompatActivity {
    public String TAG = "button_mapper";
    int admob_inter_attempts = 0;
    Animation animX;
    Animation animY;
    TextView ic_compa;
    TextView ic_splash;

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.splash_exit);
        SharedPreferences.Editor edit = getSharedPreferences("pencil_shared", 0).edit();
        edit.putBoolean("pencil_add", false);
        edit.commit();
        this.animX = AnimationUtils.loadAnimation(this, R.anim.forthankyou);
        this.animY = AnimationUtils.loadAnimation(this, R.anim.forcompany);
        this.animX.setAnimationListener(new Animation.AnimationListener() { // from class: com.techno_world.pencil.sketch.camera.ExitScreen.1
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                Log.i(ExitScreen.this.TAG, "X ended");
                ExitScreen.this.finish();
            }
        });
        TextView textView = (TextView) findViewById(R.id.thank);
        this.ic_splash = textView;
        textView.setAnimation(this.animX);
        this.ic_splash.startAnimation(this.animX);
        TextView textView2 = (TextView) findViewById(R.id.comp);
        this.ic_compa = textView2;
        textView2.setAnimation(this.animY);
        this.ic_compa.startAnimation(this.animY);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
    }
}
