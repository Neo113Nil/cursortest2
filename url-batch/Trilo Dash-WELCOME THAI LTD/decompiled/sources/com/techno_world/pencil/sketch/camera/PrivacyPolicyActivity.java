package com.techno_world.pencil.sketch.camera;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.AppCompatButton;

/* loaded from: classes2.dex */
public class PrivacyPolicyActivity extends WebViewBaseActivity {
    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_privacy_policy);
        initializeWebView(R.id.web_view);
        ((AppCompatButton) findViewById(R.id.agree)).setOnClickListener(new View.OnClickListener() { // from class: com.techno_world.pencil.sketch.camera.PrivacyPolicyActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                SharedPreferences.Editor edit = PrivacyPolicyActivity.this.getSharedPreferences("privacy_checker", 0).edit();
                edit.putBoolean("privacy_granted", true);
                edit.commit();
                PrivacyPolicyActivity.this.startActivity(new Intent(PrivacyPolicyActivity.this, (Class<?>) ImageSelection_Copy.class));
            }
        });
        this.webView.loadUrl("file:///android_asset/privacy/privacy_policy.html");
    }
}
