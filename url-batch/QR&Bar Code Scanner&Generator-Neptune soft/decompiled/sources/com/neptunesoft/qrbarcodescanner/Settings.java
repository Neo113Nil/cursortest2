package com.neptunesoft.qrbarcodescanner;

import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.Switch;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.play.core.review.ReviewInfo;
import com.google.android.play.core.review.ReviewManager;
import com.google.android.play.core.review.ReviewManagerFactory;
import com.google.android.play.core.tasks.OnCompleteListener;
import com.google.android.play.core.tasks.Task;

/* loaded from: classes2.dex */
public class Settings extends AppCompatActivity {
    boolean light_camera;
    ReviewInfo reviewInfo;
    ReviewManager reviewManager;
    boolean sound_reader;

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_settings);
        final SharedPreferences sharedPreferences = getSharedPreferences("LIGHTCAMERA", 0);
        this.light_camera = sharedPreferences.getBoolean("switchkey2", true);
        final SharedPreferences sharedPreferences2 = getSharedPreferences("DARKMODE", 0);
        this.sound_reader = sharedPreferences2.getBoolean("switchkey3", true);
        final Switch r1 = (Switch) findViewById(R.id.switch_light);
        r1.setChecked(this.light_camera);
        r1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.neptunesoft.qrbarcodescanner.Settings$$ExternalSyntheticLambda2
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                Settings.this.m159lambda$onCreate$0$comneptunesoftqrbarcodescannerSettings(sharedPreferences, r1, compoundButton, z);
            }
        });
        final Switch r4 = (Switch) findViewById(R.id.switch_sound);
        r4.setChecked(this.sound_reader);
        r4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.neptunesoft.qrbarcodescanner.Settings$$ExternalSyntheticLambda3
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                Settings.this.m160lambda$onCreate$1$comneptunesoftqrbarcodescannerSettings(sharedPreferences2, r4, compoundButton, z);
            }
        });
        r4.setChecked(this.sound_reader);
        r1.setChecked(this.light_camera);
        ((LinearLayout) findViewById(R.id.item_settings_light)).setOnClickListener(new View.OnClickListener() { // from class: com.neptunesoft.qrbarcodescanner.Settings$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Switch r0 = r1;
                r0.setChecked(!r0.isChecked());
            }
        });
        ((LinearLayout) findViewById(R.id.item_settings_sound)).setOnClickListener(new View.OnClickListener() { // from class: com.neptunesoft.qrbarcodescanner.Settings$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Switch r0 = r4;
                r0.setChecked(!r0.isChecked());
            }
        });
    }

    /* renamed from: lambda$onCreate$0$com-neptunesoft-qrbarcodescanner-Settings, reason: not valid java name */
    /* synthetic */ void m159lambda$onCreate$0$comneptunesoftqrbarcodescannerSettings(SharedPreferences sharedPreferences, Switch r2, CompoundButton compoundButton, boolean z) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putBoolean("switchkey2", r2.isChecked());
        edit.apply();
        this.light_camera = r2.isChecked();
    }

    /* renamed from: lambda$onCreate$1$com-neptunesoft-qrbarcodescanner-Settings, reason: not valid java name */
    /* synthetic */ void m160lambda$onCreate$1$comneptunesoftqrbarcodescannerSettings(SharedPreferences sharedPreferences, Switch r2, CompoundButton compoundButton, boolean z) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putBoolean("switchkey3", r2.isChecked());
        edit.apply();
        this.sound_reader = r2.isChecked();
    }

    private void init() {
        if (test_connection()) {
            ReviewManager create = ReviewManagerFactory.create(this);
            this.reviewManager = create;
            create.requestReviewFlow().addOnCompleteListener(new OnCompleteListener<ReviewInfo>() { // from class: com.neptunesoft.qrbarcodescanner.Settings.1
                @Override // com.google.android.play.core.tasks.OnCompleteListener
                public void onComplete(Task<ReviewInfo> task) {
                    if (task.isSuccessful()) {
                        Settings.this.reviewInfo = task.getResult();
                        ReviewManager reviewManager = Settings.this.reviewManager;
                        Settings settings = Settings.this;
                        reviewManager.launchReviewFlow(settings, settings.reviewInfo).addOnCompleteListener(new OnCompleteListener<Void>() { // from class: com.neptunesoft.qrbarcodescanner.Settings.1.1
                            @Override // com.google.android.play.core.tasks.OnCompleteListener
                            public void onComplete(Task<Void> task2) {
                            }
                        });
                    }
                }
            });
        }
    }

    public boolean test_connection() {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
            if (activeNetworkInfo != null) {
                return activeNetworkInfo.isConnected();
            }
            return false;
        } catch (NullPointerException unused) {
            return false;
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        init();
    }
}
