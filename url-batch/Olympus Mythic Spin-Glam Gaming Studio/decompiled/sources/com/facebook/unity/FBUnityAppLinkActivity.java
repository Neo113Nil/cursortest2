package com.facebook.unity;

import android.view.MotionEvent;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* loaded from: classes3.dex */
public class FBUnityAppLinkActivity extends FBUnityAppLinkBaseActivity {
    @Override // com.facebook.unity.FBUnityAppLinkBaseActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch(this, "com.facebook", me);
        return super.dispatchTouchEvent(me);
    }
}
