package com.mbridge.msdk.config.activity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.mbridge.msdk.foundation.tools.i0;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;

/* loaded from: classes14.dex */
public class MBRewardVideoActivity extends BaseActivity {
    ViewGroup b;

    @Override // com.mbridge.msdk.config.activity.BaseActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch(this, h.o, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // com.mbridge.msdk.config.activity.BaseActivity, android.app.Activity
    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        ViewGroup viewGroup = (ViewGroup) getLayoutInflater().inflate(i0.a(getApplicationContext(), "mbridge_activity", "layout"), (ViewGroup) null);
        this.b = viewGroup;
        setContentView(viewGroup);
        this.a = new a(this, this.b);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }
}
