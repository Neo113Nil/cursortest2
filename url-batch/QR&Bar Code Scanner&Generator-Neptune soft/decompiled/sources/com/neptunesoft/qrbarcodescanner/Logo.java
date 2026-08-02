package com.neptunesoft.qrbarcodescanner;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import androidx.appcompat.app.AppCompatActivity;

/* loaded from: classes2.dex */
public class Logo extends AppCompatActivity {
    Handler handler = new Handler();
    Runnable time_wait_logo = new Runnable() { // from class: com.neptunesoft.qrbarcodescanner.Logo.1
        @Override // java.lang.Runnable
        public void run() {
            Logo.this.startActivity(new Intent(Logo.this.getApplicationContext(), (Class<?>) MainActivity.class));
            Logo.this.finish();
            Logo.this.handler.removeCallbacks(Logo.this.time_wait_logo);
        }
    };

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_logo);
        Window window = getWindow();
        window.addFlags(Integer.MIN_VALUE);
        window.clearFlags(67108864);
        window.getDecorView().setSystemUiVisibility(8192);
        window.setNavigationBarColor(getColor(R.color.snow));
        window.setStatusBarColor(getColor(R.color.snow));
        this.handler.postDelayed(this.time_wait_logo, 1000L);
    }
}
