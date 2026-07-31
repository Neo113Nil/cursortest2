package com.smaato.sdk.ng.rewarded.activity;

import android.view.MotionEvent;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;

/* loaded from: classes12.dex */
public class MraidRewardedActivity extends NextGenRewardedActivity {
    @Override // com.smaato.sdk.ng.rewarded.activity.NextGenRewardedActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch(this, h.v, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.smaato.sdk.ng.rewarded.activity.NextGenRewardedActivity, android.app.Activity
    protected void onDestroy() {
        this.g.destroyAd();
        super.onDestroy();
    }

    @Override // com.smaato.sdk.ng.rewarded.activity.NextGenRewardedActivity, android.app.Activity
    protected void onPause() {
        super.onPause();
        this.g.pauseAd();
    }

    @Override // com.smaato.sdk.ng.rewarded.activity.NextGenRewardedActivity, android.app.Activity
    protected void onResume() {
        this.g.resumeAd();
        super.onResume();
    }
}
