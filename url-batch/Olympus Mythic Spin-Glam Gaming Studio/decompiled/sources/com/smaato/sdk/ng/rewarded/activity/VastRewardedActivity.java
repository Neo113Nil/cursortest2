package com.smaato.sdk.ng.rewarded.activity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;
import com.smaato.sdk.ng.rewarded.viewModel.VastRewardedViewModel;
import com.smaato.sdk.ng.vpaid.NextGenActivityInteractor;

/* loaded from: classes6.dex */
public class VastRewardedActivity extends NextGenRewardedActivity {
    private NextGenActivityInteractor i;

    private synchronized void f() {
        this.i = NextGenActivityInteractor.getInstance();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g() {
        f();
        this.i.activityPaused();
        this.g.pauseAd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h() {
        f();
        this.i.activityResumed();
        this.g.resumeAd();
    }

    @Override // com.smaato.sdk.ng.rewarded.activity.NextGenRewardedActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch(this, h.v, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.smaato.sdk.ng.rewarded.activity.NextGenRewardedActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((VastRewardedViewModel) this.g).renderVastAd();
    }

    @Override // com.smaato.sdk.ng.rewarded.activity.NextGenRewardedActivity, android.app.Activity
    protected void onDestroy() {
        f();
        this.i.activityDestroyed();
        this.g.destroyAd();
        super.onDestroy();
    }

    @Override // com.smaato.sdk.ng.rewarded.activity.NextGenRewardedActivity, android.app.Activity
    protected void onPause() {
        if (!this.e) {
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.smaato.sdk.ng.rewarded.activity.VastRewardedActivity$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    VastRewardedActivity.this.g();
                }
            }, 100L);
        }
        super.onPause();
    }

    @Override // com.smaato.sdk.ng.rewarded.activity.NextGenRewardedActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.smaato.sdk.ng.rewarded.activity.VastRewardedActivity$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                VastRewardedActivity.this.h();
            }
        }, 100L);
    }
}
