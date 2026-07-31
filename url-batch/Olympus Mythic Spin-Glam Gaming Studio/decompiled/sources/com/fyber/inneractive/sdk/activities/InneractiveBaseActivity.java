package com.fyber.inneractive.sdk.activities;

import android.R;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.window.OnBackInvokedDispatcher;
import androidx.annotation.Nullable;
import com.fyber.inneractive.sdk.util.IAlog;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* loaded from: classes3.dex */
public class InneractiveBaseActivity extends Activity {
    public b a;

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch(this, com.safedk.android.utils.h.p, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        super.onCreate(bundle);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.content);
        if (frameLayout != null && Build.VERSION.SDK_INT >= 35) {
            frameLayout.setOnApplyWindowInsetsListener(new com.fyber.inneractive.sdk.util.m());
        }
        if (Build.VERSION.SDK_INT >= 33) {
            this.a = new b(this);
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.registerOnBackInvokedCallback(0, this.a);
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        super.onDestroy();
        if (Build.VERSION.SDK_INT >= 33) {
            try {
                if (this.a != null) {
                    onBackInvokedDispatcher = getOnBackInvokedDispatcher();
                    onBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.a);
                    this.a = null;
                }
            } catch (Exception e) {
                IAlog.f("failed to unregisterOnBackInvokedCallback with error: %s", e.getMessage());
            }
        }
    }
}
