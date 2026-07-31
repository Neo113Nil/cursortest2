package com.inmobi.media;

import android.os.Bundle;
import androidx.browser.customtabs.EngagementSignalsCallback;

/* renamed from: com.inmobi.media.bj, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C3896bj implements EngagementSignalsCallback {
    public final V2 a;
    public final W2 b;
    public final X2 c;

    public C3896bj(V2 v2, W2 w2, X2 x2) {
        this.a = v2;
        this.b = w2;
        this.c = x2;
    }

    @Override // androidx.browser.customtabs.EngagementSignalsCallback
    public final void onGreatestScrollPercentageIncreased(int i, Bundle bundle) {
        try {
            this.b.a(i);
        } catch (Exception unused) {
        }
    }

    @Override // androidx.browser.customtabs.EngagementSignalsCallback
    public final void onSessionEnded(boolean z, Bundle bundle) {
        try {
            this.c.a(z);
        } catch (Exception unused) {
        }
    }

    @Override // androidx.browser.customtabs.EngagementSignalsCallback
    public final void onVerticalScrollEvent(boolean z, Bundle bundle) {
        try {
            Y2 y2 = this.a.a;
            if (y2.h) {
                return;
            }
            y2.h = true;
            C4081ii c4081ii = (C4081ii) y2.i.get();
            if (c4081ii != null) {
                GestureDetectorOnGestureListenerC4476xi.g1.getClass();
                c4081ii.a(C3947di.a("IN_NATIVE_BROWSER", "onScroll"));
            }
        } catch (Exception unused) {
        }
    }
}
