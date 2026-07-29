package com.techno_world.pencil.sketch.camera;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;

/* loaded from: classes2.dex */
public class SplashScreen extends AppCompatActivity {
    private InterstitialAd interstitial_admob;
    InterstitialAdLoadCallback showAds_onBack = new InterstitialAdLoadCallback() { // from class: com.techno_world.pencil.sketch.camera.SplashScreen.1
        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdLoaded(InterstitialAd interstitialAd) {
            SplashScreen.this.interstitial_admob = interstitialAd;
            SplashScreen.this.interstitial_admob.setFullScreenContentCallback(new FullScreenContentCallback() { // from class: com.techno_world.pencil.sketch.camera.SplashScreen.1.1
                @Override // com.google.android.gms.ads.FullScreenContentCallback
                public void onAdDismissedFullScreenContent() {
                    super.onAdDismissedFullScreenContent();
                    SplashScreen.this.interstitial_admob = null;
                    SplashScreen.this.movetonextActivity();
                }

                @Override // com.google.android.gms.ads.FullScreenContentCallback
                public void onAdFailedToShowFullScreenContent(AdError adError) {
                    super.onAdFailedToShowFullScreenContent(adError);
                    SplashScreen.this.interstitial_admob = null;
                }

                @Override // com.google.android.gms.ads.FullScreenContentCallback
                public void onAdShowedFullScreenContent() {
                    super.onAdShowedFullScreenContent();
                    SplashScreen.this.interstitial_admob = null;
                }
            });
            if (!ProcessLifecycleOwner.get().getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.STARTED) || SplashScreen.this.interstitial_admob == null) {
                return;
            }
            SplashScreen.this.interstitial_admob.show(SplashScreen.this);
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdFailedToLoad(LoadAdError loadAdError) {
            SplashScreen.this.interstitial_admob = null;
            SplashScreen.this.movetonextActivity();
        }
    };

    public void movetonextActivity() {
        if (getSharedPreferences("privacy_checker", 0).getBoolean("privacy_granted", false)) {
            startActivity(new Intent(this, (Class<?>) ImageSelection_Copy.class));
        } else {
            startActivity(new Intent(this, (Class<?>) PrivacyPolicyActivity.class));
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.splash_technoworld);
        InterstitialAd.load(this, getResources().getString(R.string.AdInter), new AdRequest.Builder().build(), this.showAds_onBack);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        Toast.makeText(this, "Loading App. Please Wait..", 0).show();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
    }
}
