package com.mobilefuse.sdk;

import android.view.MotionEvent;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;
import kotlin.Metadata;

/* compiled from: MobileFuseFullscreenTransparentActivity.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/mobilefuse/sdk/MobileFuseFullscreenTransparentActivity;", "Lcom/mobilefuse/sdk/MobileFuseFullscreenActivity;", "()V", "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
/* loaded from: classes15.dex */
public final class MobileFuseFullscreenTransparentActivity extends MobileFuseFullscreenActivity {
    @Override // com.mobilefuse.sdk.MobileFuseFullscreenActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch(this, h.E, me);
        return super.dispatchTouchEvent(me);
    }
}
