package com.inmobi.media;

/* loaded from: classes13.dex */
public final class X2 {
    public final /* synthetic */ Y2 a;

    public X2(Y2 y2) {
        this.a = y2;
    }

    public final void a(boolean z) {
        C4081ii c4081ii;
        if (z && (c4081ii = (C4081ii) this.a.i.get()) != null) {
            GestureDetectorOnGestureListenerC4476xi.g1.getClass();
            c4081ii.a(C3947di.a("IN_NATIVE_BROWSER", "onInteraction"));
        }
        C4081ii c4081ii2 = (C4081ii) this.a.i.get();
        if (c4081ii2 != null) {
            GestureDetectorOnGestureListenerC4476xi.g1.getClass();
            c4081ii2.a(C3947di.a("IN_NATIVE_BROWSER", "onClose"));
        }
    }
}
