package com.ogury.ad.interstitial.ui;

import android.view.MotionEvent;
import com.ogury.ad.internal.b;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ogury/ad/interstitial/ui/InterstitialAndroid8TransparentActivity;", "Lcom/ogury/ad/interstitial/ui/InterstitialActivity;", "<init>", "()V", "sdk-ads_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class InterstitialAndroid8TransparentActivity extends InterstitialActivity {
    @Override // com.ogury.ad.interstitial.ui.InterstitialActivity
    public final void a(b bVar) {
    }

    @Override // com.ogury.ad.interstitial.ui.InterstitialActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch(this, "io.presage", me);
        return super.dispatchTouchEvent(me);
    }
}
