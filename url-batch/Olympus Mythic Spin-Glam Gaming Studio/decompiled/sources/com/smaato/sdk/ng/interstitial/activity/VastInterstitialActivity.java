package com.smaato.sdk.ng.interstitial.activity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;
import com.smaato.sdk.ng.interstitial.viewModel.VastInterstitialViewModel;
import com.smaato.sdk.ng.vpaid.NextGenActivityInteractor;

/* loaded from: classes4.dex */
public class VastInterstitialActivity extends NextGenInterstitialActivity {
    private NextGenActivityInteractor h;

    private synchronized void f() {
        this.h = NextGenActivityInteractor.getInstance();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g() {
        f();
        this.h.activityPaused();
        this.f.pauseAd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h() {
        f();
        this.h.activityResumed();
        this.f.resumeAd();
    }

    @Override // com.smaato.sdk.ng.interstitial.activity.NextGenInterstitialActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch(this, h.v, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.smaato.sdk.ng.interstitial.activity.NextGenInterstitialActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        f();
        this.h.activityCreated();
        ((VastInterstitialViewModel) this.f).renderVastAd();
    }

    @Override // com.smaato.sdk.ng.interstitial.activity.NextGenInterstitialActivity, android.app.Activity
    protected void onDestroy() {
        f();
        this.h.activityDestroyed();
        this.f.destroyAd();
        super.onDestroy();
    }

    @Override // com.smaato.sdk.ng.interstitial.activity.NextGenInterstitialActivity, android.app.Activity
    protected void onPause() {
        if (!this.e) {
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.smaato.sdk.ng.interstitial.activity.VastInterstitialActivity$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    VastInterstitialActivity.this.g();
                }
            }, 100L);
        }
        super.onPause();
    }

    @Override // com.smaato.sdk.ng.interstitial.activity.NextGenInterstitialActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.smaato.sdk.ng.interstitial.activity.VastInterstitialActivity$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                VastInterstitialActivity.this.h();
            }
        }, 100L);
    }
}
