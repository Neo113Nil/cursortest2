package com.vungle.ads.internal.ui;

import android.view.MotionEvent;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/vungle/ads/internal/ui/VungleActivity;", "Lcom/vungle/ads/internal/ui/l;", "<init>", "()V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes12.dex */
public final class VungleActivity extends l {
    @Override // com.vungle.ads.internal.ui.l, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch(this, com.safedk.android.utils.h.d, me);
        return super.dispatchTouchEvent(me);
    }
}
