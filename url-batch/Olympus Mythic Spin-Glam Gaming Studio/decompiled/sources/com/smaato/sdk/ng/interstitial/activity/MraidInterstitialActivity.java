package com.smaato.sdk.ng.interstitial.activity;

import android.view.MotionEvent;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;

/* loaded from: classes3.dex */
public class MraidInterstitialActivity extends NextGenInterstitialActivity {
    @Override // com.smaato.sdk.ng.interstitial.activity.NextGenInterstitialActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch(this, h.v, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.smaato.sdk.ng.interstitial.activity.NextGenInterstitialActivity, android.app.Activity
    protected void onDestroy() {
        this.f.destroyAd();
        super.onDestroy();
    }

    @Override // com.smaato.sdk.ng.interstitial.activity.NextGenInterstitialActivity, android.app.Activity
    protected void onPause() {
        super.onPause();
        this.f.pauseAd();
    }

    @Override // com.smaato.sdk.ng.interstitial.activity.NextGenInterstitialActivity, android.app.Activity
    protected void onResume() {
        this.f.resumeAd();
        super.onResume();
    }
}
