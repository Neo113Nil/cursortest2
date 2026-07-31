package net.pubnative.lite.sdk.rewarded.activity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;
import net.pubnative.lite.sdk.rewarded.viewModel.VastRewardedViewModel;
import net.pubnative.lite.sdk.vpaid.HyBidActivityInteractor;

/* loaded from: classes15.dex */
public class VastRewardedActivity extends HyBidRewardedActivity {
    private HyBidActivityInteractor mInteractor;

    private synchronized void fetchActivityInteractor() {
        this.mInteractor = HyBidActivityInteractor.getInstance();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onPause$0() {
        fetchActivityInteractor();
        this.mInteractor.activityPaused();
        this.mViewModel.pauseAd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onResume$1() {
        fetchActivityInteractor();
        this.mInteractor.activityResumed();
        this.mViewModel.resumeAd();
    }

    @Override // net.pubnative.lite.sdk.rewarded.activity.HyBidRewardedActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch(this, h.C, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // net.pubnative.lite.sdk.rewarded.activity.HyBidRewardedActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((VastRewardedViewModel) this.mViewModel).renderVastAd();
    }

    @Override // net.pubnative.lite.sdk.rewarded.activity.HyBidRewardedActivity, android.app.Activity
    protected void onDestroy() {
        fetchActivityInteractor();
        this.mInteractor.activityDestroyed();
        this.mViewModel.destroyAd();
        super.onDestroy();
    }

    @Override // net.pubnative.lite.sdk.rewarded.activity.HyBidRewardedActivity, android.app.Activity
    protected void onPause() {
        if (!this.mIsFinishing) {
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: net.pubnative.lite.sdk.rewarded.activity.VastRewardedActivity$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    VastRewardedActivity.this.lambda$onPause$0();
                }
            }, 100L);
        }
        super.onPause();
    }

    @Override // net.pubnative.lite.sdk.rewarded.activity.HyBidRewardedActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: net.pubnative.lite.sdk.rewarded.activity.VastRewardedActivity$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                VastRewardedActivity.this.lambda$onResume$1();
            }
        }, 100L);
    }
}
