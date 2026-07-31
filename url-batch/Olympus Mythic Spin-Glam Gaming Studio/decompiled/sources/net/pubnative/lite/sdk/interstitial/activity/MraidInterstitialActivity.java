package net.pubnative.lite.sdk.interstitial.activity;

import android.view.MotionEvent;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;

/* loaded from: classes4.dex */
public class MraidInterstitialActivity extends HyBidInterstitialActivity {
    @Override // net.pubnative.lite.sdk.interstitial.activity.HyBidInterstitialActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch(this, h.C, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // net.pubnative.lite.sdk.interstitial.activity.HyBidInterstitialActivity, android.app.Activity
    protected void onDestroy() {
        this.mViewModel.destroyAd();
        super.onDestroy();
    }

    @Override // net.pubnative.lite.sdk.interstitial.activity.HyBidInterstitialActivity, android.app.Activity
    protected void onPause() {
        super.onPause();
        this.mViewModel.pauseAd();
    }

    @Override // net.pubnative.lite.sdk.interstitial.activity.HyBidInterstitialActivity, android.app.Activity
    protected void onResume() {
        this.mViewModel.resumeAd();
        super.onResume();
    }
}
