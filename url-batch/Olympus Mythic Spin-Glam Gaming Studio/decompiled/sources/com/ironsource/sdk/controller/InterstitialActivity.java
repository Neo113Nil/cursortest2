package com.ironsource.sdk.controller;

import android.os.Bundle;
import android.view.MotionEvent;
import com.ironsource.X3;
import com.ironsource.sdk.utils.Logger;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* loaded from: classes5.dex */
public class InterstitialActivity extends ControllerActivity {
    private static final String s = "InterstitialActivity";

    @Override // com.ironsource.sdk.controller.ControllerActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch(this, com.safedk.android.utils.h.f, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.ironsource.sdk.controller.ControllerActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Logger.i(s, "onCreate");
    }

    @Override // com.ironsource.sdk.controller.ControllerActivity, android.app.Activity
    protected void onPause() {
        super.onPause();
        Logger.i(s, X3.i.t0);
    }

    @Override // com.ironsource.sdk.controller.ControllerActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        Logger.i(s, X3.i.u0);
    }
}
